package rca.ac.majuraterm1b.Service.ServiceImpl;

import org.springframework.stereotype.Service;
import rca.ac.majuraterm1b.Exceptions.InvalidOperationException;
import rca.ac.majuraterm1b.Service.MathOperator;

@Service
public class MathOperatorImpl implements MathOperator {
    @Override
    public double doMath(double operand1, double operand2, String operation) throws InvalidOperationException {
        if ("/".equals(operation) && operand2 == (double) 0) {
            throw new InvalidOperationException("Cannot divide by 0");
        }
        return switch (operation) {
            case "+" -> operand1 + operand2;
            case "-" -> operand1 - operand2;
            case "*" -> operand1 * operand2;
            case "/" -> operand1 / operand2;
            default -> throw new RuntimeException("Unknown operation");
        };
    }
}
