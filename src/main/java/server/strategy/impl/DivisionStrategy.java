package server.strategy.impl;

import server.exceptions.CalculationException;
import server.strategy.CalculationStrategy;

import static server.constants.ErrorMessage.DIVIDE_BY_ZER0;

public class DivisionStrategy implements CalculationStrategy {
    @Override
    public double calculateResult(double leftOperand, double rightOperand) {
        if(rightOperand == 0.0){
            throw new CalculationException(DIVIDE_BY_ZER0);
        }
        return leftOperand / rightOperand;
    }
}
