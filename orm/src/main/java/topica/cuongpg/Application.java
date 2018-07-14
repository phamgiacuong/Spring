package topica.cuongpg;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import topica.cuongpg.model.Category;
import topica.cuongpg.model.Item;
import topica.cuongpg.model.Type;
import topica.cuongpg.service.CategoryService;
import topica.cuongpg.service.ItemService;
import topica.cuongpg.service.TypeService;

import java.util.List;
import java.util.Scanner;

@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {
    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }

    @Autowired
    CategoryService categoryService;
    @Autowired
    ItemService itemService;
    @Autowired
    TypeService typeService;
    @Override
    public void run(String... args) throws Exception {
        Page<Category> categoryList = categoryService.findByType("Lapop",new PageRequest(0, 10));
        log.info("Category list {}", categoryList);
        Page<Item> itemsList = itemService.findByCategory("Electric", new PageRequest(0, 10));
        System.out.println("Want Update Have Category id:");
        Scanner scanner =new Scanner(System.in);
        int id = scanner.nextInt();
        System.out.println("Update:");
        System.out.println("Category name :");
        String name = scanner.next();
        System.out.println("Category typeId :");
        int typeId = scanner.nextInt();

        List<Type> typeList =typeService.findById(typeId);
        if(typeList != null){
            Page<Category> categoryUpdate=categoryService.updateById(id,name,typeId,new PageRequest(0, 10));
            log.info("Category update {}", categoryUpdate);
        }
        else {
            System.out.println("typeId not exist");
        }
    }
}