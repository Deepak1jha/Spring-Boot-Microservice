package com.candidate.Candidate.repository.candidate;

import com.candidate.Candidate.enums.Enums;
import com.candidate.Candidate.model.candidate.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CandidateRepository extends MongoRepository<Candidate,String> {

    Iterable<Candidate> findAllByAndStatus(Enums.Status status);

}
