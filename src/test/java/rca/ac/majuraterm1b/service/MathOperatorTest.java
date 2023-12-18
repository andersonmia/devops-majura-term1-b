package rca.ac.majuraterm1b.service;

import org.junit.Test;
import org.mockito.InjectMocks;
import rca.ac.majuraterm1b.Exceptions.InvalidOperationException;
import rca.ac.majuraterm1b.Service.ServiceImpl.MathOperatorImpl;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class MathOperatorTest {
    @InjectMocks
    MathOperatorImpl mathOperatorImpl;

    @Test(expected = InvalidOperationException.class)
    public void givenTwoNumbers_whenAdded_thenSuccess() throws InvalidOperationException {
        double operand1 = 1;
        double operand2 = 2;
        String operation = "+";

        double result = mathOperatorImpl.doMath(operand1, operand2, operation);
        when(mathOperatorImpl.doMath(operand1, operand2, operation)).thenReturn(result);

        double actual = mathOperatorImpl.doMath(operand1, operand2, operation);

        assertEquals(result, actual, 0.001);
    }


}
