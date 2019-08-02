package com.project.todolist.domain;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "taskfolders")
@Getter
@Setter
public class TaskFolder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String foldername;

//    @OneToMany(mappedBy = "taskfolder")
//    @JsonManagedReference
//    private List<Task> tasks;
//
//    public TaskFolder(){
//        tasks = new ArrayList<>();
//    }
}
