package com.project.todolist.service.Impl;


import com.project.todolist.domain.Task;
import com.project.todolist.repository.TaskRepostory;
import com.project.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepostory taskRepostory;

    @Override
    public List<Task> getTasks() {
        return taskRepostory.getTaskByImpo();
    }

    @Override
    public List<Task> getTasksByFindate() {
        return taskRepostory.getTaskByFindate();
    }

    @Override
    public List<Task> getTasksByStatus() {
        return taskRepostory.getTaskByStatus();
    }

    @Override
    public void addTask(Task task) {
        taskRepostory.save(task);
    }

    @Override
    public void updateBookStatus(Date todayDate) {
        taskRepostory.updateStatus(todayDate);
    }

    @Override
    public void delTask(long id) {
        taskRepostory.deleteById(id);
    }
}
