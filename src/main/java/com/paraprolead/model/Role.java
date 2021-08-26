package com.paraprolead.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Role {

    @Id
    private Long idRole;
    private String roleName;

}
