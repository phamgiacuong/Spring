package topica.cuongpg.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import topica.cuongpg.model.Type;

import java.util.List;

public interface TypeRepository {
    @Query("SELECT t FROM Type t WHERE t.id = :id")
    List<Type> findById(@Param("id") int id);
}
