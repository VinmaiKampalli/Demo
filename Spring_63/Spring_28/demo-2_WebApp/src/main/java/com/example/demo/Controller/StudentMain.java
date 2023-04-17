package com.example.demo.Controller;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Controller.std2.Std2;
@Controller
@RequestMapping("/st")

public class StudentMain
{
   private  Std2 std;
   @Autowired
   public StudentMain(Std2 std) 
   {
	   this.std=std;
	   
   }
@GetMapping("/std")
  public  String display(Model m)
  {
	 m.addAttribute("student",std.Std());
	 return"StdDetails";
  }
}  
