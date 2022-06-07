package captainciaociao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyFirstTest {
    @Test
    public void test() {
        assertEquals(42, Integer.sum(18, 23));
    }
}
