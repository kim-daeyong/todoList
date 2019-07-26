package com.project.todolist.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "taskfolder")
@Getter
@Setter
public class TaskFolder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String catename;

    @OneToMany(mappedBy = "taskFolder")
    private List<Task> tasks;
}
