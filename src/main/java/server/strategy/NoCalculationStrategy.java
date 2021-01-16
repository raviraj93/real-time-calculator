package server.strategy;

import server.exceptions.CalculationException;

import static server.constants.ErrorMessage.NO_CALCULATION_STRATEGY_FOUND;

public class NoCalculationStrategy implements CalculationStrategy {

    @Override
    public double calculateResult(double leftOperand, double rightOperand) {
        throw new CalculationException(NO_CALCULATION_STRATEGY_FOUND);
    }

}
