package com.example.demo.sym.service.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class ManagerDTO {
    private String mgrNUM,email,password;
}
