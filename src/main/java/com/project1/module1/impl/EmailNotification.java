package com.project1.module1.impl;

import com.project1.module1.NotificationService;

public class EmailNotification implements NotificationService {
    @Override
    public void send (String message){
        System.out.println("Email sending.."+message);
    }
}
