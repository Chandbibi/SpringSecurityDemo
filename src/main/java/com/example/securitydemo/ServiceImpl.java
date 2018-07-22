package com.example.securitydemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements AppService {

    @Value("${spring.message}")
    String message;

    @Override
    public String getMessage() {
        return message;
    }
}
