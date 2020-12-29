package com.example.demo.sym.service;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Manager {
    private String mgrNum, email, password;
}
