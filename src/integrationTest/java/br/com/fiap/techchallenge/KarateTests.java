package br.com.fiap.techchallenge;

import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Tag;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;

@Tag("integrationTest")
@SpringBootTest(classes = {Application.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestPropertySource(locations = "classpath:application-testIntegration.yml")
@ActiveProfiles("testIntegration")
public class KarateTests {

    @LocalServerPort
    private int localServerPort;

    @Karate.Test
    Karate customerTest() {
        return Karate.run("file:src/integrationTest/java/br/com/fiap/techchallenge/feature/Customer.feature")
                .systemProperty("karate.port", String.valueOf(localServerPort));
    }

    @Karate.Test
    Karate productTest() {
        return Karate.run("file:src/integrationTest/java/br/com/fiap/techchallenge/feature/Product.feature")
                .systemProperty("karate.port", String.valueOf(localServerPort));
    }
}
