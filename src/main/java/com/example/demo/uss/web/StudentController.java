package com.example.demo.uss.web;

import java.util.Map;

import com.example.demo.cmm.utl.Proxy;
import com.example.demo.uss.service.model.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;

@RestController
public class StudentController {

}
/*
 create table managers(mgr_num int primary key
 , email varchar2(20), 
 password varchar2(20))
  
  */
/*
create table teachers(tea_num int primary key
, email varchar2(20), 
password varchar2(20),
profile_image varchar2(100), 
name varchar2(20))
 
 */
/*
create table students(stu_num int primary key
, userid varchar2(20), 
password varchar2(20), 
name varchar2(20),
ssn varchar2(20), 
reg_date varchar2(20),
tea_num int,
subject varchar2(20),
profile_image varchar2(100)
constraint students_fk foreign key(tea_num) reference teachers(tea_num))
 
 */
/*
create table grades(
   grade_num int primary key ,
   subject varchar2(20),
   score varchar2(20),
   grade varchar2(20),
   stu_num int,
   constraint grades_fk foreign key(stu_num) references students(stu_num)
   )
 */

/*
create table articles(art_num int primary key
, title varchar2(20), 
content varchar2(50), 
count varchar2(20),
writer_num int)

 */

/*
create table replies(
reply_num int primary key
, content varchar2(20), 
art_num int,
constraint replies_fk foreign key(art_num) references articles(art_num))

 */



