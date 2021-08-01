package com.boot.schedulers;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class UserUpdateScheduler {

    @Scheduled(cron = "*/5 * * * * 0-4")
    public void updateUser(){
        System.out.println("Time: " + LocalDateTime.now().toString());
    }

}
