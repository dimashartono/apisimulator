package com.dimas.apisimulator.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class PaymentRequestDTO {
    @NotEmpty
    private String pan;
    @NotEmpty
    private String processingCode;
    @NotEmpty
    private String transactionAmount;
    @NotEmpty
    private String transmissionDateTime;
    @NotEmpty
    private String systemTraceAuditNumber;
    @NotEmpty
    private String localTransactionDateTime;
    @NotEmpty
    private String settlementDate;
    @NotEmpty
    private String captureDate;
    @NotEmpty
    private String merchantType;
    @NotEmpty
    private String posEntryMode;
    @NotEmpty
    private String feeType;
    @NotEmpty
    private String feeAmount;
    @NotEmpty
    private String acquirerId;
    @NotEmpty
    private String postalCode;
    @NotEmpty
    private String customerPan;
}
