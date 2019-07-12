package com.project.todolist.domain;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "task")
@Getter
@Setter
@Builder
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String content;
    private Date regdate;
    private Date updatedDate;
    private long taskOrder;
    private char status;
    private int level;

    public Task(){
        regdate = new Date();
        updatedDate = new Date();
    }
}
