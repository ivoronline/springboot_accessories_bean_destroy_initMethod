package com.ivoronline.springboot_accessories_bean_destroy_initmethod;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

  //PERSON
  @Bean(initMethod = "init")
  public Person person() {
    return new Person();
  }

}
