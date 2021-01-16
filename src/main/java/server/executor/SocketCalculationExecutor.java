package server.executor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import server.validate.IValidator;
import server.validate.impl.CommandLengthValidator;
import server.validate.impl.DatatypeValidator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SocketCalculationExecutor implements IExecutor {
//    private Socket socket;
//    private DataInputStream dataInputStream;
//    private DataOutputStream dataOutputStream;
    private final Logger logger = LoggerFactory.getLogger(SocketCalculationExecutor.class);
    private final CalculationExecutor calculationExecutor;
    private final List<IValidator> validatorList;

    public SocketCalculationExecutor() {
        this.calculationExecutor = new CalculationExecutor();
        this.validatorList = new ArrayList<>();
        this.validatorList.add(new DatatypeValidator());
        this.validatorList.add(new CommandLengthValidator());
    }

//    public void initializeSocket(int port)
//    {
//        try
//        {
//            ServerSocket server = new ServerSocket(port);
//            socket = server.accept();
//            System.out.println("Client accepted");
//            dataInputStream = new DataInputStream(socket.getInputStream());
//            dataOutputStream = new DataOutputStream(socket.getOutputStream());
//        }
//        catch(IOException ioException)
//        {
//            System.out.println("Exception Occurred: " + ioException);
//        }
//    }

//    public void executeCalculation() throws IOException {
//        String input;
//        while (true)
//        {
//            try
//            {
//                input = dataInputStream.readUTF();
//
//                if(input.equals("bye"))
//                    break;
//
//                System.out.println("Equation received:  " + input);
//                String[] inputArray = processInput(input);
//                validateInput(inputArray);
//                double result = calculationExecutor.doCalculation(inputArray);
//                System.out.println("Result : " + result);
//                System.out.println("Sending the result...");
//                dataOutputStream.writeUTF(Double.toString(result));
//            }
//            catch(IOException ioException)
//            {
//                System.out.println("Exception Occurred: " + ioException);
//            }
//        }
//        System.out.println("Closing connection");
//        socket.close();
//        dataInputStream.close();
//        dataOutputStream.close();
//    }

    public String execute(String input){

        System.out.println("Inside Calculation Execution");
        logger.debug("Inside CalculatorController :" + input);

        String[] inputArray = processInput(input);
        validateInput(inputArray);
        double result = calculationExecutor.doCalculation(inputArray);
        System.out.println("Result : " + result);
        return Double.toString(result);
    }
    private String[] processInput(String input) {
        Scanner s = new Scanner(input);
        return new String[] {s.next(), s.next(), s.next()};
    }

    private void validateInput(String[] inputArray) {
        validatorList.forEach(validator -> validator.validate(inputArray));
    }

//    public static void main(String[] args) throws IOException {
//        SocketCalculationExecutor server = new SocketCalculationExecutor();
//        server.initializeSocket(SERVER_PORT);
//        server.executeCalculation();
//    }

//    public void setSocket(Socket socket) {
//        this.socket = socket;
//    }
}
