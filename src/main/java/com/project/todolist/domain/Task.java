package com.project.todolist.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "tasks")
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String content;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date regdate;
    @Column(columnDefinition = "varchar(255) default '진행중'")
    private String currentstatus;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date findate;
    private int impolevel;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date updateat;

    public Task(){
        regdate = new Date();
        updateat = new Date();
        findate = new Date();
    }

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "taskfolders_id")
//    private TaskFolder taskfolder;
}
