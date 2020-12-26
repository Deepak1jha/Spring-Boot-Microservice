package com.candidate.Candidate.valueObject.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddressVO implements Serializable {

    private String addressLineOne;
    private String addressLineLineTwo;
    private String city;
    private String country;
    private String zipcode;
    private String landMark;

}
