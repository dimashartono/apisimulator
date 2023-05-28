package com.dimas.apisimulator.controller;

import com.dimas.apisimulator.dto.BaseResponseDTO;
import com.dimas.apisimulator.dto.PaymentRequestDTO;
import com.dimas.apisimulator.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/qr/payment")
    public ResponseEntity<BaseResponseDTO> requestPayment(@Valid @RequestBody PaymentRequestDTO paymentRequest){
        return paymentService.processPaymentQr(paymentRequest);
    }


}
