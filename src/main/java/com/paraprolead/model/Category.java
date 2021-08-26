package com.paraprolead.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;


@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
public class Category extends AbstractEntity{

    @Id
    private Long idCat;
    private String catName;

}
