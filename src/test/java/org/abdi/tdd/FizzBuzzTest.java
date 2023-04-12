package org.abdi.tdd;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class FizzBuzzTest {
    //if devide with 3 print fizz
    //if devide with 5 print Buzz
    //if devide with 3 and 5 print FizzBuzz
    //if not devide with 3 and 5 print the number

    @Test
    @DisplayName("Divisible by three")
    @Order(1)
    void testForDivisibleByThree(){
       String expected = "Fizz";
       assertEquals(expected, Fizz.compute(3), "Expected to be a Fizz");
    }
    @Test
    @DisplayName("Divisible by Five")
    @Order(2)
    void testForDivisibleByFive(){
        String expected = "Buzz";
        assertEquals(expected, Fizz.compute(5), "Expected to be a Buzz");
    }
    @Test
    @DisplayName("Divisible by Three and Five")
    @Order(3)
    void testForDivisibleByThreeAndFive(){
        String expected = "FizzBuzz";
        assertEquals(expected, Fizz.compute(15), "Expected to be a FizzBuzz");
    }
    @Test
    @DisplayName("Not Divisible by Three and Five")
    @Order(4)
    void testForNotDivisibleByThreeAndFive(){
        int expected = 17;
        assertEquals(expected, Integer.parseInt(Fizz.compute(17)), "Expected to be a FizzBuzz");
    }
    @ParameterizedTest(name = "value {0} ,expected {1}")
    @DisplayName("Parameterzed Test")
    @CsvFileSource(resources = "/smal-test.csv")
    @Order(5)
    void testParameterizedTest(int value, String expected){

        assertEquals(expected, Fizz.compute(value), "Expected to be a FizzBuzz");
    }
}
