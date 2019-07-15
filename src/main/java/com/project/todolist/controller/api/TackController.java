package com.project.todolist.controller.api;


import com.project.todolist.domain.Task;
import com.project.todolist.domain.dto.TaskDto;
import com.project.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController
@RequestMapping("/todo/api")
public class TackController {

    @Autowired
    TaskService taskService;

    @GetMapping("/list/default")
    public ResponseEntity getAllTasks(@Valid @ModelAttribute TaskDto taskDto) {
        List<Task> getTasks = taskService.getTasks();
        return new ResponseEntity(getTasks, HttpStatus.OK);
    }

    @GetMapping("/list/findate")
    public ResponseEntity getAllTasksByFindate(@Valid @ModelAttribute TaskDto taskDto) {
        List<Task> getTasks = taskService.getTasksByFindate();
        return new ResponseEntity(getTasks, HttpStatus.OK);
    }

    @GetMapping("/list/status")
    public ResponseEntity getAllTasksByStatus(@Valid @ModelAttribute TaskDto taskDto) {
        List<Task> getTasks = taskService.getTasksByStatus();
        return new ResponseEntity(getTasks, HttpStatus.OK);
    }

}
