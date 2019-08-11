package uk.org.webcompere;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class AccidentalJUnit4Test {
    @BeforeEach
    public void beforeEach() {

    }

    @Test
    public void test() {
        assertEquals(1, 1);
    }
}
