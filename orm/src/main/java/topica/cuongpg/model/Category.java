package topica.cuongpg.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
//    @Column(name = "typeid")
//    @ManyToOne
//    @JoinColumn(name="type_id")
    private Type typeId;

    @ManyToOne
    @JoinColumn(name="type_id")
    public Type gettypeId() {
        return typeId;
    }
}
