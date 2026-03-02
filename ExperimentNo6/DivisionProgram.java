package ExperimentNo6;

// Custom Exception
class DivisionException extends Exception {
    DivisionException(String message) {
        super(message);
    }
}

// Calculator Class
class Calculator {

    int divide(int a, int b) throws DivisionException {
        if (b == 0) {
            throw new DivisionException("Cannot divide by zero!");
        }
        return a / b;
    }
}

// Main Class
public class DivisionProgram {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        try {
            int result = cal.divide(10, 0);   // Change 0 to test
            System.out.println("Result: " + result);
        } 
        catch (DivisionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues safely...");
    }
}