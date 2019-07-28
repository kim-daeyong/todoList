package com.project.todolist.controller.api;


import com.project.todolist.domain.Task;
import com.project.todolist.domain.TaskFolder;
import com.project.todolist.domain.dto.TaskDto;
import com.project.todolist.domain.dto.TaskFolderDto;
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

    //todo > 생성 시 폴더의 이름을 넣는다.
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

    @DeleteMapping(value = "/{deltaskid}")
    public ResponseEntity delTask(@PathVariable(value = "deltaskid") long id){

        taskService.delTask(id);
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping(value = "/{uptaskid}")
    public ResponseEntity updateTask(@PathVariable Long id, @RequestBody TaskDto taskDto){
        Task task = taskService.getTaskById(id);
        BeanUtils.copyProperties(taskDto, task);
        taskService.updateTask(task);

        return new ResponseEntity(task, HttpStatus.OK);
    }


    //todo index, 작성해야한다.
    @PostMapping("/add/folder")
    public ResponseEntity addFolder(@RequestBody TaskFolderDto taskFolderDto) {

        TaskFolder taskFolder = new TaskFolder();
        BeanUtils.copyProperties(taskFolderDto, taskFolder);
        taskFolder.setFolderName(taskFolderDto.getFolderName());
        taskService.addFolder(taskFolder);

        return new ResponseEntity(taskFolder, HttpStatus.OK);
    }


    //todo index, 서비스, 레포짓 작성해야한다.
    @GetMapping("/list/cate/default")
    public ResponseEntity getAllTasks(@Valid @ModelAttribute TaskFolderDto taskFolderDto) {
//        List<TaskFolder> getTaskFolders = taskService.getTasks();
//        return new ResponseEntity(getTaskFolders, HttpStatus.OK);
          return new ResponseEntity(HttpStatus.OK);
    }

}
