package it.euris.ires;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator c;

    @BeforeEach
    void setUp() {
        c = new Calculator();
    }

    @Test
    @DisplayName("1 + 1 = 2")
    void addsTwoNumbers() {

        // arrange
        int numbA = 1;
        int numbB = 2;
        int expectedRes = 2;

        // act
        int result = c.add(numbA, numbB);

        // assertion
        assertEquals(expectedRes, result, String.format("%s + %s should equal %s", numbA, numbB, expectedRes));
    }

    @Test
    @DisplayName("3 - 1 = 2")
    void subsTwoNumbers() {
        Calculator c = new Calculator();
        assertEquals(2, c.sub(3,1), "3 - 1 should be 2");
    }

    @Test
    void givenMultWhenInput2AndInput3ThenReturn6() {
        // arrange
        int a = 2;
        int b = 3;
        int expectedRes = 6;

        // act
        int res = c.mult(a,b);

        // assertion
        assertEquals(expectedRes, res, String.format("%s * %s should be 6", a, b));
    }

    @Test
    void givenDivWhenInput4AndInput2ThenReturn2() {
        // arrange
        int a = 4;
        int b = 2;
        int expectedRes = 2;

        // act
        int res = c.div(a,b);

        // assertion
        assertEquals(expectedRes, res, String.format("%d * %d should be 2", a, b));
    }
}
