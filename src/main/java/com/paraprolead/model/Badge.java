package com.paraprolead.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;



@ToString
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Badge extends AbstractEntity{

    @Id
    private Long idBadge;
    private String Title;

}
