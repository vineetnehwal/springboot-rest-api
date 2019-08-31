package com.example.sachida.restapipoc.service;

import com.example.sachida.models.HelloResponse;
import org.springframework.stereotype.Service;

@Service
public class GreetingControllerHandler {

  public HelloResponse greeting(String name) {

    HelloResponse helloResponse = new HelloResponse();
    helloResponse.setName(name);
    helloResponse.setMessage("Hello " + name);
    return helloResponse;
  }

}
