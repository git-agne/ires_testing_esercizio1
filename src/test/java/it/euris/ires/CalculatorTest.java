package it.euris.ires;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
        int expectedRes = 3;

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
    @DisplayName("2 * 3 = 6")
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
    @DisplayName("4 / 2 = 2")
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

    @ParameterizedTest(name = "GivenFirstArgument {0} AndSecondArgument {1} WhenAddThenShouldReturn {2}")
    @CsvSource({
            "0, 1, 1",
            "0, -1, -1",
            "-50, 50, 0",
            Integer.MAX_VALUE + ", " + Integer.MAX_VALUE + ", -2"})
    void addWithBvaValues(int first, int second, int expectedResult) {
        Calculator c = new Calculator();
        assertEquals(expectedResult, c.add(first, second), () -> first + " + " + second + " should equal " + expectedResult);
    }

    @ParameterizedTest(name = "GivenFirstArgument {0} AndSecondArgument {1} WhenSubThenShouldReturn {2}")
    @CsvSource({
            "0, 1, -1",
            "0, -1, 1",
            "-50, 50, -100",
            Integer.MAX_VALUE + ", " + Integer.MAX_VALUE + ", 0"
    })
    void subWithBvaValues(int first, int second, int expectedResult) {
        int result = c.sub(first, second);
        assertEquals(expectedResult, result, () -> first + " - " + second + " should equal " + expectedResult);
    }

    @ParameterizedTest(name = "GivenFirstArgument {0} AndSecondArgument {1} WhenMultThenShouldReturn {2}")
    @CsvSource({
            "0, 1, null",
            "1, 2, 2",
            "50, 20, 1000",
            Integer.MAX_VALUE + ", " + "1, " + Integer.MAX_VALUE
    })
    void multWithBvaValues(int first, int second, int expectedResult) {
        int result = c.mult(first, second);
        assertEquals(expectedResult, result, () -> first + " + " + second + " should equal " + expectedResult);
    }

    @ParameterizedTest(name = "GivenFirstArgument {0} AndSecondArgument {1} WhenDivThenShouldReturn {2}")
    @CsvSource({
            "0, 1, null",
            "1, 2, 2",
            "50, 20, 1000",
            Integer.MAX_VALUE + ", " + Integer.MIN_VALUE + ", 0"
    })
    void divWithBvaValues(int first, int second, int expectedResult) {
        int result = c.div(first, second);
        assertEquals(expectedResult, result, () -> first + " + " + second + " should equal " + expectedResult);
    }
}
