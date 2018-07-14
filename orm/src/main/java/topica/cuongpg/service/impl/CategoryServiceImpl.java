package topica.cuongpg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import topica.cuongpg.model.Category;
import topica.cuongpg.repository.CategoryRepository;
import topica.cuongpg.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    @Override
    public Page<Category> findByType(String name, Pageable pageable) {
        return categoryRepository.findByType(name,pageable);
    }

    @Override
    public Page<Category> updateById(int id,String name, int typeId, Pageable pageable) {
        return categoryRepository.updateById(id,name, typeId, pageable);
    }
}
