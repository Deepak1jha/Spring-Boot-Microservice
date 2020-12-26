package com.candidate.Candidate.model.user;

import com.candidate.Candidate.enums.Enums;
import com.candidate.Candidate.util.AppUtil;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "users")
@Data
public class User {

    @Id
    private String id;
    @Indexed(unique = true, direction = IndexDirection.DESCENDING)
    private String username;
    @Indexed(sparse = true, direction = IndexDirection.DESCENDING)
    private String phoneNumber;
    private String password;
    private boolean enabled;
    private Enums.Status status = Enums.Status.CURRENT;
    private String uniqueId = AppUtil.generateRandomUniqueString();
    @CreatedDate
    private LocalDateTime dateCreated;
    @LastModifiedDate
    private LocalDateTime lastUpdated;
    private LocalDateTime currentDate;

}
