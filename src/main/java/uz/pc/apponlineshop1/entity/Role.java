package uz.pc.apponlineshop1.entity;

import lombok.Data;
import uz.pc.apponlineshop1.entity.enums.RoleName;

import javax.persistence.*;

@Data
@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Enumerated
    private RoleName name;

}
