package calculator;

import calculator.Add;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    void add() {
        assertEquals(2, Add.add(1, 1));
    }
}
