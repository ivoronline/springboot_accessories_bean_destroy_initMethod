package com.ivoronline.springboot_accessories_bean_destroy_initmethod;

public class Person {

  //PROPERTIES
  public String name;
  
  //CONSTRUCTOR
  Person() {
    System.out.println("Person Created");
  }
  
  //INIT
  public void init() {
    System.out.println("Person Initialized");
  }

}
