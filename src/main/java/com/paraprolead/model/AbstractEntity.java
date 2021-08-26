package com.paraprolead.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
public class AbstractEntity {


    private Date creationDate;
    private String createdBy;
    private Date updatedDate;
    private String updatedBy;


}


