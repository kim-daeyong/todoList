package com.project.todolist.repository;


import com.project.todolist.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface TaskRepostory extends JpaRepository<Task, Long> {

    // impolevel 순위로 정렬(default)
    @Query("SELECT t FROM Task t ORDER BY t.impolevel ASC")
    public List<Task> getTaskByImpo();

    // findate 순위로 정렬
    @Query("SELECT t FROM Task t ORDER BY t.findate DESC")
    public List<Task> getTaskByFindate();


    // status 순위로 정렬
    @Query("SELECT t FROM Task t ORDER BY t.currentstatus DESC")
    public List<Task> getTaskByStatus();

    // findate가 지나가면 status를 실패로..
    @Modifying
    @Query("UPDATE Task t SET t.currentstatus = '실패' WHERE t.currentstatus= '진행중' AND t.findate < todayDate ")
    public void updateStatus(@Param("date1") Date todayDate);

    // task 수정
    @Modifying
    @Query("UPDATE Task t SET t.content = :task.content, t.findate = :task.findate WHERE t.id= :task.id ")
    public void updateTask(@Param("task") Task task);


}
