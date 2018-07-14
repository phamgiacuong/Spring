package topica.cuongpg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import topica.cuongpg.model.Type;
import topica.cuongpg.repository.TypeRepository;
import topica.cuongpg.service.TypeService;

import java.util.List;

public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeRepository typeRepository;
    @Override
    public List<Type> findById(int id) {
        return typeRepository.findById(id);
    }
}
