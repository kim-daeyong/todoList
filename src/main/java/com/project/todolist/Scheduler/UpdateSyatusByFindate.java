package com.project.todolist.Scheduler;


import com.project.todolist.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class UpdateSyatusByFindate {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    String date = dateFormat.format(new Date());

    Date todayDate;

    {
        try {
            todayDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Autowired
    TaskService taskService;

    @Scheduled(cron = "0 0 0 * * *")
    public void updateSyatusByFindate() {
        //상태를 변경해주기 위한 코드
        taskService.updateBookStatus(todayDate);

    }
}
