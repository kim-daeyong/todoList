package com.project.todolist.domain.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.text.SimpleDateFormat;
import java.util.Date;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {

    private String content;
    private int impolevel;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date findate;


}
