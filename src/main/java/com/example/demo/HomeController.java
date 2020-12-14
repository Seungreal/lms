package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/")
    public String index(){
        logger.trace("Trace Level 테스트"); 
        logger.debug("DEBUG Level 테스트"); 
        logger.info("INFO Level 테스트"); 
        logger.warn("Warn Level 테스트"); 
        logger.error("ERROR Level 테스트");
        return "index";
    }
}
