package com.project.todolist.repository;


import com.project.todolist.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepostory extends JpaRepository<Task, Long> {

    // impolevel 순위로 정렬(default)
    @Query("SELECT t FROM Task t ORDER BY t.impolevel ASC")
    public List<Task> getTaskByImpo();


}
