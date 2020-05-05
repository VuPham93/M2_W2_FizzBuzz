import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void testFizzBuzz1() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz2() {
        int number = 5;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz3() {
        int number = 9;
        String expected = "Fizz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz4() {
        int number = 10;
        String expected = "Buzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz5() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz7() {
        int number = 7;
        String expected = "Seven";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz8() {
        int number = 17;
        String expected = "Seventeen";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz9() {
        int number = 23;
        String expected = "Twenty Three";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz10() {
        int number = 232;
        String expected = "Two hundreds and Thirty Two";

        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
}