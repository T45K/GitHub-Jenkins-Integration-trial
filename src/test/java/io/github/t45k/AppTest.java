package io.github.t45k;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        App.main(new String[]{"foo"});
        assertTrue(true);
    }
}
