package topica.cuongpg.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@Data
@Entity
@Table(name = "type")
public class ItemCategory {
    @Column(name = "categoryid")
    private int categoryId;
    @Column(name = "itemid")
    private String itemId;
}
