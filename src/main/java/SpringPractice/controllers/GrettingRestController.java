package SpringPractice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrettingRestController {
    @GetMapping("/saludo/{name}")
    public String Saludo(@PathVariable String name){
        return "Hola "+ name;
    }
}
