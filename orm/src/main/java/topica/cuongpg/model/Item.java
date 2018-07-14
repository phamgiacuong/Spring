package topica.cuongpg.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@Data
@Entity
@Table(name = "item")
public class Item {
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
}
