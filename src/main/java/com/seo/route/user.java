package com.seo.route;

import org.springframework.web.bind.annotation.*;

@RestController
public class user {
    @GetMapping
    public String getusers(){
        return "users";
    }
}
