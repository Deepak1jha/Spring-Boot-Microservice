package com.Address.Address.commandObject.candidate;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressCO {

    private String addressLineOne;
    private String addressLineLineTwo;
    private String city;
    private String country;
    private String zipcode;
    private String landMark;
    private String candidateUID;

}
