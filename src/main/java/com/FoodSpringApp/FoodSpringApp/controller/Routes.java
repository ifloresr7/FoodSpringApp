package com.FoodSpringApp.FoodSpringApp.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController; 


@RestController
public class Routes {
   
   /**
    @GetMapping("/")
    public String home() {
        return "Welcome to FoodSpringApp";
    }

    @GetMapping("/hola")
    public String holaMundo() {
        
        return "¡Hola Mundo!";
        
    }
        */

    @GetMapping("/saludo")
	public String saludo(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "saludo";
	}
}
    

/**
@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

}
    */