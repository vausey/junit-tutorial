package com.vausey.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    private Calculator calculator;

    @BeforeEach
    public void setUp() throws Exception{
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple multiplication should work")
    public void testMultiply(){
        assertEquals(20, calculator.multiply(4,5),"Regular multiplication should work");
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    public void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(0,5),"Multiple with zero should be zero");
        assertEquals(0, calculator.multiply(5,0),"Multiple with zero should be zero");
    }

    @Test
    @DisplayName("Simple addition should work")
    public void testAddition(){
        assertEquals(10, calculator.add(5,5),"Regular addition should work");
    }

    @Test
    @DisplayName("Simple subtraction should work")
    public void testSubtraction(){
        assertEquals(1,calculator.subtract(2,1),"Regular subtraction should work");
    }

    @Test
    @DisplayName("Simple division should work")
    public void testDivision(){
        assertEquals(5,calculator.divide(25,5),"Regular Division should work");
    }

}
