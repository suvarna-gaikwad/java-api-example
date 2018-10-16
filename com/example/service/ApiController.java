package com.example.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sgaikwad on 10/15/2018.
 */
@RestController
public class ApiController {

    @RequestMapping("/setItem")
    public String setItem(@RequestParam(value="name", defaultValue = "DryfruitShake")String name){
        return new ApiRequest().setItemName(name);
    }
}
