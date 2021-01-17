package server.strategy.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import server.exceptions.CalculationException;
import server.strategy.CalculationStrategy;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivisionStrategyTest {

    private CalculationStrategy calculationStrategy;

    @BeforeEach
    public void setup(){
        calculationStrategy = new DivisionStrategy();
    }

    @Test
    public void checkInstanceOf() {
        Assertions.assertTrue(calculationStrategy instanceof DivisionStrategy);
    }

    @Test
    public void shouldGiveCorrectResult() {
        Assertions.assertEquals(1.0 , calculationStrategy.calculateResult(2.0, 2.0), 0);
    }

    @Test
    public void shouldGiveCorrectResultIfOneOperandIsZero() {
        Assertions.assertEquals(0.0 , calculationStrategy.calculateResult(0.0, 2.0), 0);
    }

    @Test
    public void shouldThrowException() {
        assertThrows(CalculationException.class,
                () -> calculationStrategy.calculateResult(2.0, 0.0));
    }
}