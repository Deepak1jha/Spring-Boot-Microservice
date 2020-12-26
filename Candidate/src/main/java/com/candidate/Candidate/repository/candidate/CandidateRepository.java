package com.candidate.Candidate.repository.candidate;

import com.candidate.Candidate.enums.Enums;
import com.candidate.Candidate.model.candidate.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface CandidateRepository extends MongoRepository<Candidate, String> {

    Iterable<Candidate> findAllByAndStatus(Enums.Status status);

    Optional<Candidate> findByUniqueId(String id);

}
