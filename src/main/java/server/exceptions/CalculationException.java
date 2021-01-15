package server.exceptions;

public class CalculationException extends RuntimeException{

    private static final long serialVersionUID = 1197307133590600364L;

    public CalculationException(String message) {
        super(message);
    }
}
