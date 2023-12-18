package rca.ac.majuraterm1b.Controller;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rca.ac.majuraterm1b.DTO.DoMathReqDTO;
import rca.ac.majuraterm1b.Exceptions.InvalidOperationException;
import rca.ac.majuraterm1b.Service.ServiceImpl.MathOperatorImpl;
import rca.ac.majuraterm1b.utils.CustomResponse;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/doMath")
public class MathController {
    private final MathOperatorImpl mathOperatorImpl;

    public ResponseEntity<CustomResponse> doMath(@RequestBody DoMathReqDTO doMathReqDTO) throws InvalidOperationException {
        return ResponseEntity.ok(new CustomResponse("success", mathOperatorImpl.doMath(doMathReqDTO.getOperand1(), doMathReqDTO.getOperand2(), doMathReqDTO.getOperation())));
    }
}
