package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MovieController {
//  @Autowired
//  private RestTemplate restTemplate;

  /*@GetMapping("/user/{id}")
  public User findById(@PathVariable Long id) {
    return this.restTemplate.getForObject("http://localhost:8000/" + id, User.class);
  }*/


    @GetMapping("/user/{id}")
    public Map findById(@PathVariable Long id) {
        return new HashMap();
    }
}
