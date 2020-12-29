package com.example.demo.sym.service;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Teacher {
    private String teaNum, name, password, subject;

}
