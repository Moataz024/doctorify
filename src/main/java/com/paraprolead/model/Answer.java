package com.paraprolead.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Answer extends AbstractEntity{

    @Id
    private Long idAnswer;
    private String text;
    private String Status;
    private boolean verified;



}
