package com.project.todolist.repository;


import com.project.todolist.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepostory extends JpaRepository<Task, Long> {




}
