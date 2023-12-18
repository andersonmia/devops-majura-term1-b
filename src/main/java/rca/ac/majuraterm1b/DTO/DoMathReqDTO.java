package rca.ac.majuraterm1b.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DoMathReqDTO {
    private double operand1;
    private double operand2;
    private String operation;

}