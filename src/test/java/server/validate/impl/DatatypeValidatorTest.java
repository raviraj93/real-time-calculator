package server.validate.impl;

import org.junit.Before;
import org.junit.Test;
import server.exceptions.CalculationException;
import server.validate.IValidator;

import static org.junit.Assert.*;

public class DatatypeValidatorTest {

    private IValidator iValidator;

    @Before
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

    @Test(expected = CalculationException.class)
    public void shouldThrowExceptionIfCommandLengthDoesNotMatch(){
        String [] input = new String[]{"+", "2", "-"};
        iValidator.validate(input);
    }
}