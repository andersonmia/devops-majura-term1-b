package rca.ac.majuraterm1b.Service;
import rca.ac.majuraterm1b.Exceptions.InvalidOperationException;

public interface MathOperator {
    double doMath(double operand1, double operand2, String operation) throws InvalidOperationException;
}
