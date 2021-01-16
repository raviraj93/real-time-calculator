package server.strategy.impl;

import org.junit.Before;
import org.junit.Test;
import server.exceptions.CalculationException;
import server.strategy.CalculationStrategy;

import static org.junit.Assert.*;

public class DivisionStrategyTest {

    private CalculationStrategy calculationStrategy;

    @Before
    public void setup(){
        calculationStrategy = new DivisionStrategy();
    }

    @Test
    public void checkInstanceOf() {
        assertTrue(calculationStrategy instanceof DivisionStrategy);
    }

    @Test
    public void shouldGiveCorrectResult() {
        assertEquals(1.0 , calculationStrategy.calculateResult(2.0, 2.0), 0);
    }

    @Test
    public void shouldGiveCorrectResultIfOneOperandIsZero() {
        assertEquals(0.0 , calculationStrategy.calculateResult(0.0, 2.0), 0);
    }

    @Test(expected = CalculationException.class)
    public void shouldThrowException() {
        assertEquals("" , calculationStrategy.calculateResult(2.0, 0.0), 0);
    }
}