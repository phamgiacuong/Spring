package topica.cuongpg.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
@Table(name = "type")
public class Type {
    @Id
    @GeneratedValue
    @Column(name="id")
    private int id;
    @Column(name = "name")
    private String name;


    @OneToMany(mappedBy="type", cascade = CascadeType.ALL)
    private Set<Category> category = new HashSet<>();
}
