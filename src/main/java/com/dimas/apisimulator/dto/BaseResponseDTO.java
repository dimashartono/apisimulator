package com.dimas.apisimulator.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class BaseResponseDTO {
    private String resMessage;
    private Object data;
}
