package demo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppTests {

    @Test
    void simpleTest() {

        Assertions.assertThat(2 + 3).isEqualTo(5);
    }

}
