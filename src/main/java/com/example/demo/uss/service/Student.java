package com.example.demo.uss.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Data @AllArgsConstructor @Lazy @NoArgsConstructor
public class Student {
    private String stuNum, userid, password, name, ssn, regDate,profileImage,subject;
}
