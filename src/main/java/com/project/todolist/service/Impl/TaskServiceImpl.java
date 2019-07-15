package com.project.todolist.service.Impl;


import com.project.todolist.domain.Task;
import com.project.todolist.repository.TaskRepostory;
import com.project.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepostory taskRepostory;

    @Override
    public List<Task> getTasks() {
        return taskRepostory.getTaskByImpo();
    }
}
