package com.linkedin.infra.config.instances;

import com.linkedin.core.ITestUseCase;
import com.linkedin.core.services.TestServices;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class UsesCases {

  @Bean
  public ITestUseCase testUseCase() {
    return new TestServices();
  }
}
