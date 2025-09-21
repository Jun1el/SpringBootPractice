package SpringPractice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordRestController {
    @GetMapping({"/hello","/SW"})
    public String sayHello() {
        System.out.println("Solicitud ejecutada");
        return "Hello World!";
    }
}
