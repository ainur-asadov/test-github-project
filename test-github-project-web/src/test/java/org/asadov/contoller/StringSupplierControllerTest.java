package org.asadov.contoller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.client.RestTemplate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class StringSupplierControllerTest {

    private final RestTemplate restTemplate = new RestTemplate();

    @LocalServerPort
    private int port;

    @Test
    void strings_default_correctStringReturned() {
        Assertions.assertEquals(
                "Some String",
                restTemplate.getForObject("http://localhost:" + port + "/strings", String.class)
        );
    }

}