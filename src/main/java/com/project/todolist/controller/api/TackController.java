package com.project.todolist.controller.api;


import com.project.todolist.domain.Task;
import com.project.todolist.domain.dto.TaskDto;
import com.project.todolist.service.TaskService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/add")
    public ResponseEntity addTask(@RequestBody TaskDto taskDto) {

        Task task = new Task();
//        BeanUtils.copyProperties(taskDto, task);
        task.setContent(taskDto.getContent());
        task.setFindate(taskDto.getFindate());
        task.setImpolevel(taskDto.getImpolevel());
        task.setCurrentstatus("진행중");
        taskService.addTask(task);

        return new ResponseEntity(task, HttpStatus.OK);
    }

    @DeleteMapping(value = "/{delTaskId}")
    public ResponseEntity delTask(@RequestBody long id){


        return new ResponseEntity(HttpStatus.OK);
    }


}
