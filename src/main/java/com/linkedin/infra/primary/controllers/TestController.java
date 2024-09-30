package com.linkedin.infra.primary.controllers;

import com.linkedin.core.ITestUseCase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

  private final ITestUseCase testUseCase;

  public TestController(ITestUseCase testUseCase) {
    this.testUseCase = testUseCase;
  }

  @RequestMapping("/")
  public String GetTest() {
    return this.testUseCase.GetTest();
  }
}
