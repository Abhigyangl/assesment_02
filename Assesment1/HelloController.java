package com.java;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloController 
{

  @RequestMapping("/hello")
  


  public String display(@RequestParam("empno") String empno,@RequestParam("name") String name,@RequestParam("designation") String desg,@RequestParam("salary") String sal,Model m) throws Exception

  { 

      String msg = "Empno ="+empno+" Name ="+name+" Designation ="+desg+"  Salary ="+sal;

      m.addAttribute("message", msg);

      return "viewpage"; 

  }

}