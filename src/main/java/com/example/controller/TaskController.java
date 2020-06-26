package com.example.controller;

import com.example.service.TaskProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

  @Autowired
  private TaskProcessor t;

  @RequestMapping(path="/tasks", method=RequestMethod.POST)
  public @ResponseBody String launchTask(@RequestBody String s){

    t.publishRquest(s);

    System.out.println("request made");

    return "Success";
  }
}
