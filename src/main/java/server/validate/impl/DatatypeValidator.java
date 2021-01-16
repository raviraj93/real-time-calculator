package server.validate.impl;

import org.apache.commons.lang3.StringUtils;
import server.exceptions.CalculationException;
import server.validate.IValidator;

import static server.constants.ErrorMessage.INVALID_DATATYPE;

public class DatatypeValidator implements IValidator {
    @Override
    public void validate(String[] inputArray) throws CalculationException {
        if((!StringUtils.isNumeric(inputArray[0])) || (!StringUtils.isNumeric(inputArray[2]))) {
            throw new CalculationException(INVALID_DATATYPE);
        }
    }
}
