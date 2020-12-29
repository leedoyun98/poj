package com.example.demo.sts.service;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Grade {
    private String gradeNum, subject, score, grade, stuNum;
}
