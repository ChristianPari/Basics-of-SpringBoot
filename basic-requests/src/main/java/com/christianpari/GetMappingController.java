package com.christianpari;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/get")
public class GetMappingController {

  @GetMapping("/String")
  public String getString() { return "Hello World!"; }

  @GetMapping("/List")
  public List<String> getList() {
    List<String> list = Arrays.asList("Item1", "Item2", "Item3");
    return list;
  }
}
