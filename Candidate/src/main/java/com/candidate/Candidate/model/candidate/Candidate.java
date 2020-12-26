package com.candidate.Candidate.model.candidate;

import com.candidate.Candidate.commandObject.candidate.CandidateCO;
import com.candidate.Candidate.enums.Enums;
import com.candidate.Candidate.model.user.User;
import com.candidate.Candidate.util.AppConstant;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Document(collection = "users")
@TypeAlias("candidate")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Candidate extends User implements Serializable {

    @NotEmpty(message = "validation.customer.firstName.empty")
    private String firstName;
    private String middleName;
    private String lastName;
    private Enums.Gender gender;
    @NotEmpty(message = "validation.customer.dateOfBirth.empty")
    private LocalDate dateOfBirth;
    private Boolean isVerified = false;

    public Candidate(CandidateCO candidateCO) {
        this.firstName = candidateCO.getFirstName();
        this.middleName = candidateCO.getMiddleName();
        this.lastName = candidateCO.getLastName();
        this.gender = Enums.Gender.valueOf(candidateCO.getGender());
        this.dateOfBirth = LocalDate.parse(candidateCO.getDateOfBirth(), DateTimeFormatter.ofPattern(AppConstant.STR_TO_DATE_FORMAT_REV));
        this.setEnabled(true);
        this.setUsername(candidateCO.getUsername());
        this.setPhoneNumber(candidateCO.getPhoneNumber());
    }

}
