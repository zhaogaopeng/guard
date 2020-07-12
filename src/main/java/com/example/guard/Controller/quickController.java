package com.example.guard.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/quick")
@Controller
public class quickController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello springBootssss";
    }

}
