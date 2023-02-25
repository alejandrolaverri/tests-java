package com.alejandromo.javatests.fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    /*
     * Si el número es divisible por 3, retorna “Fizz”
     * Si el número es divisible por 5, retorna “Buzz”
     * Si el número es divisible por 3 y por 5, retorna “FizzBuzz”
     * En otro caso, retorna el mismo número
     */
    @Test
    public void return_fizz() {
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }
    @Test
    public void return_buzz() {
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }
    @Test
    public void return_fizzbuzz() {
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }
    @Test
    public void return_number() {
        assertEquals("1", FizzBuzz.fizzBuzz(1));
    }
}