package com.candidate.Candidate.valueObject.response;

import com.candidate.Candidate.model.candidate.Candidate;
import com.candidate.Candidate.valueObject.address.AddressVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Candidate candidate;
    private AddressVO addressVO;
}
