package server.validate.impl;

import server.exceptions.CalculationException;
import server.validate.IValidator;

import static server.constants.CalculationConstants.NUMBER_OF_PARAMETERS;
import static server.constants.ErrorMessage.PARAMETER_COUNT_MISMATCH;

public class CommandLengthValidator implements IValidator {
    @Override
    public void validate(String[] inputArray) throws CalculationException {
        if(inputArray.length != NUMBER_OF_PARAMETERS){
            throw new CalculationException(PARAMETER_COUNT_MISMATCH);
        }
    }
}
