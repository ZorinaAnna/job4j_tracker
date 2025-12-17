package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTest {

    @Test
    void whenFirstGreaterThanSecondThenReturnFirst() {
        Max calculator = new Max();
        assertEquals(10, calculator.max(10, 5));
    }

    @Test
    void whenMixedPositiveAndNegativeNumbersThenReturnPositive() {
        Max calculator = new Max();
        assertEquals(15, calculator.max(-10, 15, 5));
    }
}