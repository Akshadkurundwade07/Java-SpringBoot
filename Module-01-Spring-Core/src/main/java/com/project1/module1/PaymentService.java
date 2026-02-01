package com.project1.module1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

    public void pay(){
        System.out.println("paying");
    }

    @PostConstruct
    public void afterInitia(){
        System.out.println("before paying");
    }

    @PreDestroy
    public void afterDes(){
        System.out.println("after stopping server");
    }

}
