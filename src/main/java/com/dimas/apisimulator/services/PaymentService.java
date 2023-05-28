package com.dimas.apisimulator.services;

import com.dimas.apisimulator.dto.BaseResponseDTO;
import com.dimas.apisimulator.dto.PaymentRequestDTO;
import com.dimas.apisimulator.dto.ResponsePayment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public ResponseEntity<BaseResponseDTO> processPaymentQr(PaymentRequestDTO paymentRequest){

        var payment = ResponsePayment.builder()
                .status("1030")
                .amount(3000000.00)
                .build();

        return ResponseEntity.status(HttpStatus.OK)
                .contentType(MediaType.APPLICATION_JSON)
                .body(BaseResponseDTO.builder()
                        .resMessage("SUCCESS")
                        .data(payment)
                        .build());


    }

}
