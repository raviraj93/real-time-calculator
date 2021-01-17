package server.executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import server.constants.SuccessMessage;
import server.exceptions.CalculationException;
import server.validate.IValidator;
import server.validate.impl.CommandLengthValidator;
import server.validate.impl.DatatypeValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.text.MessageFormat.format;
import static server.constants.ErrorMessage.PARAMETER_COUNT_MISMATCH;

public class SocketCalculationExecutor implements IExecutor {
    private final Logger logger = LoggerFactory.getLogger(SocketCalculationExecutor.class);
    private final CalculationExecutor calculationExecutor;
    private final List<IValidator> validatorList;

    public SocketCalculationExecutor() {
        this.calculationExecutor = new CalculationExecutor();
        this.validatorList = new ArrayList<>();
        this.validatorList.add(new DatatypeValidator());
        this.validatorList.add(new CommandLengthValidator());
    }

    public String execute(String input){

        logger.debug("Inside CalculatorController :" + input);

        String[] inputArray = processInput(input);
        validateInput(inputArray);
        double result = calculationExecutor.doCalculation(inputArray);

        logger.debug(format(SuccessMessage.RESULT , result));
        return Double.toString(result);
    }

    private String[] processInput(String input) {
        try {
            Scanner s = new Scanner(input);
            return new String[] {s.next(), s.next(), s.next()};
        }catch (Exception exception){
            throw new CalculationException(PARAMETER_COUNT_MISMATCH);
        }
    }

    private void validateInput(String[] inputArray) {
        validatorList.forEach(validator -> validator.validate(inputArray));
    }

}
