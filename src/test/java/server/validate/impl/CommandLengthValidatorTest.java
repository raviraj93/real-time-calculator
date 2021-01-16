package server.validate.impl;

import org.junit.Before;
import org.junit.Test;
import server.exceptions.CalculationException;
import server.validate.IValidator;

import static org.junit.Assert.assertTrue;

public class CommandLengthValidatorTest {

    private IValidator iValidator;

    @Before
    public void setUp() throws Exception {
        iValidator = new CommandLengthValidator();
    }

    @Test
    public void shouldValidateInstanceType(){
        assertTrue(iValidator instanceof CommandLengthValidator);
    }

    @Test
    public void shouldValidateCommandLength(){
        String [] input = new String[]{"+", "2", "4"};
        iValidator.validate(input);
    }

    @Test(expected = CalculationException.class)
    public void shouldThrowExceptionIfCommandLengthDoesNotMatch(){
        String [] input = new String[]{"+", "2", "4","5"};
        iValidator.validate(input);
    }
}