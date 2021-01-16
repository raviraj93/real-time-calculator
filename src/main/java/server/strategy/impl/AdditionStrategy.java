package server.strategy.impl;

import server.strategy.CalculationStrategy;

public class AdditionStrategy implements CalculationStrategy {
    @Override
    public double calculateResult(double leftOperand, double rightOperand) {
        return leftOperand + rightOperand;
    }
}
