package server.executor;

import server.constants.enums.Operators;
import server.strategy.CalculationStrategy;

public class CalculationExecutor {
    public double doCalculation(String [] inputArgumentsArray){
        CalculationStrategy calculationStrategy = Operators.getOperatorStrategy(inputArgumentsArray[1]); // Assuming the notation in form of X + Y
        double firstOperand = Double.parseDouble(inputArgumentsArray[0]);
        double secondOperand = Double.parseDouble(inputArgumentsArray[2]);
        return calculationStrategy.calculateResult(firstOperand, secondOperand);
    }
}
