package rca.ac.majuraterm1b.controller;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import rca.ac.majuraterm1b.DTO.DoMathReqDTO;
import rca.ac.majuraterm1b.utils.CustomResponse;

public class MathControllerTest {
    @Autowired
    RestTemplate restTemplate;

    @Test
    public void doMath_whenValidInput_thenSuccess() {
        DoMathReqDTO doMathReqDTO = new DoMathReqDTO(1, 2, "+");
        ResponseEntity<CustomResponse> responseEntity = restTemplate.postForEntity("/api/v1/doMath", doMathReqDTO, CustomResponse.class);
        assert responseEntity.getStatusCode().is2xxSuccessful();
    }
}
