package br.com.oliveira.learning

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello-spring")
class SpringGreetingController {

    @GetMapping
    fun hello() = "Hello Spring"
}