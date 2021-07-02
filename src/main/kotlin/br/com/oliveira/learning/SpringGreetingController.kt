package br.com.oliveira.learning

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/hello-spring")
class SpringGreetingController {

   /* val logger: Logger = LogManager.getLogger(SpringGreetingController::class)*/

    private val LOGGER: Logger =
        LoggerFactory.getLogger(SpringGreetingController::class.java)
    @GetMapping
    fun hello(): String {

        LOGGER.info("DEU CERTOOOOOO")
        return "Hello Spring";

    }
}