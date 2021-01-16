package server.strategy.impl;

import server.strategy.CalculationStrategy;

public class SubtractionStrategy implements CalculationStrategy {
    @Override
    public double calculateResult(double leftOperand, double rightOperand) {
        return leftOperand - rightOperand;
    }
}
