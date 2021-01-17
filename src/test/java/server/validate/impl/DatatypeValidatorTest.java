package server.validate.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import server.exceptions.CalculationException;
import server.validate.IValidator;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatatypeValidatorTest {

    private IValidator iValidator;

    @BeforeEach
    public void setUp() throws Exception {
        iValidator = new DatatypeValidator();
    }

    @Test
    public void shouldValidateInstanceType(){
        assertTrue(iValidator instanceof DatatypeValidator);
    }

    @Test
    public void shouldValidateDataType(){
        String [] input = new String[]{"2", "+", "4"};
        iValidator.validate(input);
    }

    @Test
    public void shouldThrowExceptionIfCommandLengthDoesNotMatch(){
        String [] input = new String[]{"+", "2", "-"};
       assertThrows(CalculationException.class, () -> iValidator.validate(input));
    }
}