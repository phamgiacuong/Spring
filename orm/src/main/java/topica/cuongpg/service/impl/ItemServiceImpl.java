package topica.cuongpg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import topica.cuongpg.model.Item;
import topica.cuongpg.repository.ItemRepository;
import topica.cuongpg.service.ItemService;

public class ItemServiceImpl implements ItemService {
    @Autowired
    ItemRepository itemRepository;
    @Override
    public Page<Item> findByCategory(String name, Pageable pageable) {
        return itemRepository.findByCategory(name, pageable);
    }
}
