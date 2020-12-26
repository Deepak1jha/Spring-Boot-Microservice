package com.candidate.Candidate.service.candidate;

import com.candidate.Candidate.commandObject.candidate.CandidateCO;
import com.candidate.Candidate.enums.Enums;
import com.candidate.Candidate.model.candidate.Candidate;
import com.candidate.Candidate.repository.candidate.CandidateRepository;
import com.candidate.Candidate.util.exception.CandidateNotFoundException;
import com.candidate.Candidate.valueObject.candidate.CandidateVO;
import com.candidate.Candidate.valueObject.response.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;

    public CandidateVO create(CandidateCO candidateCO) {
        Candidate candidate = new Candidate(candidateCO);
        candidateRepository.save(candidate);
        return new CandidateVO(candidate);
    }

    public List<CandidateVO> fetchAll() {
        List<CandidateVO> candidateVOList = new ArrayList<>();
        Iterable<Candidate> candidateIterator = candidateRepository.findAllByAndStatus(Enums.Status.CURRENT);
        candidateIterator.forEach(candidate -> candidateVOList.add(new CandidateVO(candidate)));
        return candidateVOList;
    }

    public ResponseTemplateVO fetch(String candidateUID) {
        Candidate candidate = candidateRepository.findByUniqueId(candidateUID).orElseThrow(() -> new CandidateNotFoundException("Candidate Not Found with this UID" + candidateUID));
    }
}
