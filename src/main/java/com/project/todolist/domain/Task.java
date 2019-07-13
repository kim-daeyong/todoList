package com.project.todolist.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "task")
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String content;
    private Date regdate;
    private char status;
    private int impolevel;
    private Date updateat;

    public Task(){
        regdate = new Date();
        updateat = new Date();
    }
}
