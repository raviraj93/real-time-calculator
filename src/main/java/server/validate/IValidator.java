package server.validate;

import server.constants.enums.Operators;
import server.exceptions.CalculationException;

public interface IValidator {
    public void validate(String [] inputArray) throws CalculationException;
}
