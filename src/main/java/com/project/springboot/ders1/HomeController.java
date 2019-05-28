package com.project.springboot.ders1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // bu annotation bu class'i rest controller edir. Rest controller gelen request zamani burdaki metodlar isleyecek
public class HomeController {

    @RequestMapping("/hello")
    public String hello() {

        return "Hi man.. I am learning SpringBoot! :)";

    }

}