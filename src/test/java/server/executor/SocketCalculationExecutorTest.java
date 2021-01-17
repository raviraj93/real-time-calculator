package server.executor;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import server.exceptions.CalculationException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SocketCalculationExecutorTest {

    private IExecutor socketCalculationExecutor;

    @BeforeEach
    public void setup(){
        socketCalculationExecutor = new SocketCalculationExecutor();
    }

    @Test
    public void checkInstanceOf(){
        assertTrue(socketCalculationExecutor instanceof  SocketCalculationExecutor);
    }

    @Test
    public void shouldReturnTheCorrectExpressionResult(){
        String input = "1 + 2";
        assertEquals("3.0", socketCalculationExecutor.execute(input));
    }

    @Test
    public void shouldReturnExceptionForInvalidInput(){
        String input = "1 +";
        assertThrows(CalculationException.class, () -> socketCalculationExecutor.execute(input));
    }

    @Test
    public void shouldReturnExceptionForEmptyString(){
        String input = "";
        assertThrows(CalculationException.class, () -> socketCalculationExecutor.execute(input));
    }

    @Test
    public void shouldReturnExceptionForExpressionWithoutSpaces(){
        String input = "1+2";
        assertThrows(CalculationException.class, () -> socketCalculationExecutor.execute(input));
    }
}