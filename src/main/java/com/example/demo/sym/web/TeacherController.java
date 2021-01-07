package com.example.demo.sym.web;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.sym.service.Teacher;
import com.example.demo.sym.service.TeacherMapper;


@RestController
@RequestMapping("/teachers")
public class TeacherController {
//	@Autowired TeacherMapper teacherMapper;
//	@PostMapping("")
//	public Map<?, ?> register(@RequestBody Teacher teacher){
//		var map = new HashMap<>();
//		map.put("massage", (teacherMapper.insert(teacher)==1) ? "SUCCESS":"FAILURE");
//		return map;
//	}

}
