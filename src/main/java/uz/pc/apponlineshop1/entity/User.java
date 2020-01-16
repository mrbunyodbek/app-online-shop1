package uz.pc.apponlineshop1.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uz.pc.apponlineshop1.entity.enums.GenderEnum;

import uz.pc.apponlineshop1.template.AbsEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity(name = "Users")
public class User extends AbsEntity {

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;


    private String middleName;


    private Date birthDate;

    @Enumerated(value = EnumType.STRING)
    private GenderEnum genderEnum;

    @Column(nullable = false, unique = true, length = 13)
    private String phoneNumber;

    @Column(nullable = false)
    private String password;

    @ManyToMany
    private List<Role> roles;


}
