package com.candidate.Candidate.valueObject.candidate;

import com.candidate.Candidate.model.candidate.Candidate;
import com.candidate.Candidate.util.AppConstant;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
public class CandidateVO implements Serializable {

    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String dateOfBirth;
    private String username;
    private String phoneNumber;
    private String uniqueId;

    public CandidateVO(Candidate candidate) {
        this.firstName = candidate.getFirstName();
        this.middleName = candidate.getMiddleName();
        this.lastName = candidate.getLastName();
        this.gender = candidate.getGender().name();
        this.dateOfBirth = candidate.getDateOfBirth().format(DateTimeFormatter.ofPattern(AppConstant.STR_TO_DATE_FORMAT_REV));
        this.username = candidate.getUsername();
        this.phoneNumber = candidate.getPhoneNumber();
        this.uniqueId = candidate.getUniqueId();
    }

}
