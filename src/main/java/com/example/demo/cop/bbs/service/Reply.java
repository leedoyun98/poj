package com.example.demo.cop.bbs.service;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Reply extends Article {
    private String replyNum, content, artNum;
}
