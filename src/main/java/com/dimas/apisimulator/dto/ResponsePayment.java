package com.dimas.apisimulator.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ResponsePayment {

    private String status;
    private Double amount;

}
