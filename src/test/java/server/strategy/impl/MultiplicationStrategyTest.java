package server.strategy.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import server.strategy.CalculationStrategy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MultiplicationStrategyTest {


    private CalculationStrategy calculationStrategy;

    @BeforeEach
    public void setup(){
        calculationStrategy = new MultiplicationStrategy();
    }

    @Test
    public void checkInstanceOf() {
        assertTrue(calculationStrategy instanceof MultiplicationStrategy);
    }

    @Test
    public void shouldGiveCorrectResult() {
        assertEquals(4.0 , calculationStrategy.calculateResult(2.0, 2.0), 0);
    }

    @Test
    public void shouldGiveCorrectResultIfOneOperandIsZero() {
        assertEquals(0.0 , calculationStrategy.calculateResult(0.0, 2.0), 0);
    }
}