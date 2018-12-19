package com.zpxu.cloud;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
    @GetMapping("/hello")
    public String hello(){
        return "hello world！";
    }
    @RequestMapping(value = "/person/{personId}",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("personId")Integer personId){
        Person person = new Person();
        person.setId(personId);
        person.setName("XuZhaoPeng");
        person.setAge(20);
        return person;
    }
}
