package server.strategy.impl;

import org.junit.Before;
import org.junit.Test;
import server.strategy.CalculationStrategy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AdditionStrategyTest {

    private CalculationStrategy calculationStrategy;

    @Before
    public void setup(){
        calculationStrategy = new AdditionStrategy();
    }

    @Test
    public void checkInstanceOf() {
        assertTrue(calculationStrategy instanceof AdditionStrategy);
    }

    @Test
    public void shouldGiveCorrectResult() {
        assertEquals(4.0 , calculationStrategy.calculateResult(2.0, 2.0), 0);
    }

    @Test
    public void shouldGiveCorrectResultIfOneOperandIsZero() {
        assertEquals(2.0 , calculationStrategy.calculateResult(0.0, 2.0), 0);
    }
}