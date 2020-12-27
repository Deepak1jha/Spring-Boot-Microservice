package com.candidate.Candidate.commandObject.candidate;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
public class CandidateCO {

    @NotNull(message = "validation.CandidateCO.firstName.empty")
    private String firstName;
    private String middleName;
    private String lastName;
    @NotBlank(message = "validation.CandidateCO.gender.empty")
    private String gender;
    @NotBlank(message = "validation.CandidateCO.dateOfBirth.empty")
    private String dateOfBirth;
    @NotBlank(message = "validation.CandidateCO.username.empty")
    private String username;
    @NotBlank(message = "validation.CandidateCO.phoneNumber.empty")
    private String phoneNumber;

}
