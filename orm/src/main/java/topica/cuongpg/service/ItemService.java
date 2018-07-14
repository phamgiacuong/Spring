package topica.cuongpg.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import topica.cuongpg.model.Item;

public interface ItemService {
    Page<Item> findByCategory(String name, Pageable pageable);
}
