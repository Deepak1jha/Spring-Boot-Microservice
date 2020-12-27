package com.Address.Address.model.address;

import com.Address.Address.commandObject.address.AddressCO;
import com.Address.Address.enums.Enums;
import com.Address.Address.util.AppUtil;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.time.LocalDateTime;

@Document(collection = "addresses")
@Data
public class Address implements Serializable {

    @Id
    private String id;
    private String addressLineOne;
    private String addressLineLineTwo;
    private String city;
    private String country;
    private String zipcode;
    private String landMark;
    private String candidateUID;
    private Enums.Status status = Enums.Status.CURRENT;
    private String uniqueId = AppUtil.generateRandomUniqueString();
    @CreatedDate
    private LocalDateTime dateCreated;
    @LastModifiedDate
    private LocalDateTime lastUpdated;
    private LocalDateTime currentDate;


    public Address(AddressCO addressCO) {
        this.addressLineOne = addressCO.getAddressLineOne();
        this.addressLineLineTwo = addressCO.getAddressLineLineTwo();
        this.city = addressCO.getCity();
        this.country = addressCO.getCountry();
        this.zipcode = addressCO.getZipcode();
        this.landMark = addressCO.getLandMark();
        this.candidateUID = addressCO.getCandidateUID();
    }

}
