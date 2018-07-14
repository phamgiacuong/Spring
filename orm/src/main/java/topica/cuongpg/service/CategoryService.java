package topica.cuongpg.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import topica.cuongpg.model.Category;


public interface CategoryService {
    Page<Category> findByType(String name, Pageable pageable);

    Page<Category> updateById(int id,String name, int typeId, Pageable pageable);
}
