package com.example.demo.sym.web;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.sym.service.TeacherService;
import com.example.demo.sym.service.model.TeacherDTO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
    @Autowired TeacherService teacherService;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @PostMapping("/teachers")
    public Map<?,?> register(@RequestBody TeacherDTO t){
        var map = new HashMap<>();
        logger.info("강사 정보:"+t.toString());
        int result = teacherService.register(t);
        map.put("message", result==1?"SUCCESS":"FAILURE");
        return map;
    }
}
