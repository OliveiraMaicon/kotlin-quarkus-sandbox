package br.com.oliveira.learning

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
class SpringGreetingControllerTest {

    @Test
    fun testHelloEndpoint() {
        given()
          .`when`().get("/hello-spring")
          .then()
             .statusCode(200)
             .body(`is`("Hello Spring"))
    }

}