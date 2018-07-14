package topica.cuongpg.repository;

import org.hibernate.sql.Update;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import topica.cuongpg.model.Category;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category,Long> {

    @Query("SELECT ca FROM Type t JOIN Category ca WHERE t.name = :name")
    Page<Category> findByType(@Param("name") String name, Pageable pageable);

    @Query("UPDATE Category c set c.name = :name, c.typeId =:Typeid WHERE c.id = :id")
    Page<Category> updateById(@Param("id") int id,@Param("name") String name,@Param("Typeid") int typeId, Pageable pageable);



}
