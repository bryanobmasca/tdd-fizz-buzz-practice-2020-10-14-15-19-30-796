package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void should_return_1_when_count_off_given_order_number_1() {
        //given
        int orderNumber = 1;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(orderNumber);

        //then
        assertEquals("1", actual);
    }

    @Test
    void should_return_fizz_when_count_off_given_order_number_3() {
        //given
        int orderNumber = 3;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(orderNumber);

        //then
        assertEquals("Fizz", actual);
    }

    @Test
    void should_return_buzz_when_count_off_given_order_number_5() {
        //given
        int orderNumber = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(orderNumber);

        //then
        assertEquals("Buzz", actual);
    }

    @Test
    void should_return_whizz_when_count_off_given_order_number_7() {
        //given
        int orderNumber = 7;
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        String actual = fizzBuzz.countOff(orderNumber);

        //then
        assertEquals("Whizz", actual);
    }
}
