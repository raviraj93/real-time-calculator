package server.constants.enums;

import server.strategy.CalculationStrategy;
import server.strategy.NoCalculationStrategy;
import server.strategy.impl.AdditionStrategy;
import server.strategy.impl.DivisionStrategy;
import server.strategy.impl.MultiplicationStrategy;
import server.strategy.impl.SubtractionStrategy;

import java.util.HashMap;

public enum Operators {
    ADDITION("+", new AdditionStrategy()),
    SUBTRACTION("-" ,new SubtractionStrategy()),
    MULTIPLICATION("*",new MultiplicationStrategy()),
    DIVISION("/", new DivisionStrategy());

    private final String operator;
    private final CalculationStrategy calculationStrategy;

    private static final HashMap<String, CalculationStrategy> stringOperatorsHashMap = new HashMap<>();

    static {
        for (Operators operators : Operators.values()) {
            stringOperatorsHashMap.put(operators.getOperator(), operators.calculationStrategy);
        }
    }
    Operators(String command,  CalculationStrategy calculationStrategy) {
        this.operator = command;
        this.calculationStrategy = calculationStrategy;
    }


    public String getOperator() {
        return operator;
    }


    public CalculationStrategy getCalculationStrategy() {
        return calculationStrategy;
    }

    public static CalculationStrategy getOperatorStrategy(String value) {
        return stringOperatorsHashMap.getOrDefault(value, new NoCalculationStrategy());
    }
}
