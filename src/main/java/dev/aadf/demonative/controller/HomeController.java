package dev.aadf.demonative.controller;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
  @JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
  record Person(String name, String gender, String dateOfBirth) {}
  @GetMapping("/hello")
  public Person hello() {
//    return new Person("Adam", "male", "1984-06-17");
    return new Person("Eve", "female", "1984-06-17");
  }
}
