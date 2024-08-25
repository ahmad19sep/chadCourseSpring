package com.corespring.chadspring.exceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
public class StudentErrorResponse {
    private  int errorCode;
    private String errorMessage;
    private long timestamp;

}
