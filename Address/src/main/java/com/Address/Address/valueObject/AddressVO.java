package com.Address.Address.valueObject;

import com.Address.Address.model.address.Address;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class AddressVO implements Serializable {

    private String addressLineOne;
    private String addressLineLineTwo;
    private String city;
    private String country;
    private String zipcode;
    private String landMark;
    private String candidateUID;

    public AddressVO(Address address) {
        this.addressLineOne = address.getAddressLineOne();
        this.addressLineLineTwo = address.getAddressLineLineTwo();
        this.city = address.getCity();
        this.country = address.getCountry();
        this.zipcode = address.getZipcode();
        this.landMark = address.getLandMark();
        this.candidateUID = address.getCandidateUID();
    }

}
