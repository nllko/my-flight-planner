package com.example.myflightplanner.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testing-api")
public class TestingController {

  @PostMapping("/clear")
  public void clear() {

  }
}