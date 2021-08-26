package com.paraprolead.model;


import lombok.*;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@Setter
@Entity
public class Question extends AbstractEntity{

    @Id
    private Long idQuestion;
    private String title;
    private String text;
    private String status;
    private int viewCount;
    private int commentCount;


}
