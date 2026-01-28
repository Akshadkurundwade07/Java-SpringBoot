package com.project1.module1.impl;

import com.project1.module1.NotificationService;

public class SmsNotificationService implements NotificationService {
    @Override
    public void send (String message){
        System.out.println("sms sending.."+message);
    }
}
