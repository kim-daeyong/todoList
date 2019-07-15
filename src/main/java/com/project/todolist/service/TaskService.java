package com.project.todolist.service;


import com.project.todolist.domain.Task;
import org.springframework.stereotype.Service;

import java.util.List;


public interface TaskService {

    List<Task> getTasks();

    List<Task> getTasksByFindate();

    List<Task> getTasksByStatus();
}
