package topica.cuongpg.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import topica.cuongpg.model.Item;

public interface ItemRepository extends PagingAndSortingRepository<Item,Long> {
    @Query("SELECT i FROM Item i JOIN ItemCategory ic ON (i.id = ic.itemId)" +
            "JOIN Category c ON (ic.categoryId = c.id)" +
            "WHERE c.name = :name")
    Page<Item> findByCategory(@Param("name") String name, Pageable pageable);
}
