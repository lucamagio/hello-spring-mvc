package it.lesson.hello_spring_mvc.demo.controllers;

import java.time.LocalTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class GreetingController {

@GetMapping("/greeting")
public String greeting(@RequestParam(name = "name")String name,
                       @RequestParam(name = "cognome")String cognome,
                       Model model) {
model.addAttribute("name", name);
model.addAttribute("cognome", cognome);
model.addAttribute("time", LocalTime.now());
return "greeting";
}

}
