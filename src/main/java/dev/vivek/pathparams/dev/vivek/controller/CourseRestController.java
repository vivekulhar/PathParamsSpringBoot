package dev.vivek.pathparams.dev.vivek.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRestController {
    @GetMapping("/course/{cname}/trainer/{tname}")
    public String getCourseDetails(@PathVariable String cname,@PathVariable String tname){
        String msg = cname + " course name is SBMS  and trainer name is " + tname;
        return msg;
    }
}
