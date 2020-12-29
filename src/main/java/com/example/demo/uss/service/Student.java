package com.example.demo.uss.service;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@Data
public class Student {
    private String stuNum, userid, password, name, ssn, regDate;
}
