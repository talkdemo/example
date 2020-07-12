import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GreeterTest {
    @Test
    public void hello_shouldGreetWorld_whenNameIsWorld() {
        assertThat(Greeter.hello("World")).isEqualTo("Hello World!");
    }
}
