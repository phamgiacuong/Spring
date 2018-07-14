package topica.cuongpg.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import topica.cuongpg.model.Item;
import topica.cuongpg.model.Type;

import java.util.List;

public interface TypeService {
    List<Type> findById(int id);
}
