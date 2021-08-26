package com.paraprolead.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User extends AbstractEntity{


    @Id
    private Long idUser;
    private String username;
    private String password;
    private String email;
    private Date birthDate;
    private String name;
    private String lastName;
    private String jobTitle;
}
