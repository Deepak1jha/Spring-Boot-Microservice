package com.candidate.Candidate.valueObject.apiResponse;

import com.candidate.Candidate.enums.Enums;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class ApiResponseVO implements Serializable {

    private Enums.ResponseType responseType;
    private String message;
    private Object data;

    public ApiResponseVO(Enums.ResponseType responseType, String message, Object data) {
        this.responseType = responseType;
        this.message = message;
        this.data = data;
    }

}
