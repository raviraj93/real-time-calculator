package server.strategy.impl;

import org.junit.Before;
import org.junit.Test;
import server.strategy.CalculationStrategy;

import static org.junit.Assert.*;

public class SubtractionStrategyTest {


    private CalculationStrategy calculationStrategy;

    @Before
    public void setup(){
        calculationStrategy = new SubtractionStrategy();
    }

    @Test
    public void checkInstanceOf() {
        assertTrue(calculationStrategy instanceof SubtractionStrategy);
    }

    @Test
    public void shouldGiveCorrectResult() {
        assertEquals(0.0 , calculationStrategy.calculateResult(2.0, 2.0), 0);
    }

    @Test
    public void shouldGiveCorrectResultIfOneOperandIsZero() {
        assertEquals(-2.0 , calculationStrategy.calculateResult(0.0, 2.0), 0);
    }
}