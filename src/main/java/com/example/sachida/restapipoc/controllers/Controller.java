package com.example.sachida.restapipoc.controllers;

import com.example.sachida.models.HelloResponse;
import com.example.sachida.restapipoc.service.GreetingControllerHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Controller {

  @Resource
  GreetingControllerHandler _greetingControllerHandler;

  @RequestMapping("/greeting")
  HelloResponse greeting(@RequestParam String name) {
    return _greetingControllerHandler.greeting(name);
  }


}
