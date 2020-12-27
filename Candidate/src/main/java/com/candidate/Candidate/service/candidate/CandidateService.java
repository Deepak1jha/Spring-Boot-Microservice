package com.candidate.Candidate.service.candidate;

import com.candidate.Candidate.commandObject.candidate.CandidateCO;
import com.candidate.Candidate.enums.Enums;
import com.candidate.Candidate.model.candidate.Candidate;
import com.candidate.Candidate.repository.candidate.CandidateRepository;
import com.candidate.Candidate.util.exception.CandidateNotFoundException;
import com.candidate.Candidate.valueObject.address.AddressVO;
import com.candidate.Candidate.valueObject.candidate.CandidateVO;
import com.candidate.Candidate.valueObject.response.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class CandidateService {

    @Autowired
    private CandidateRepository candidateRepository;
    @Autowired
    private RestTemplate restTemplate;

    public CandidateVO create(CandidateCO candidateCO) {
        log.info(candidateCO.toString());
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
        AddressVO addressVO = restTemplate.getForObject("http://ADDRESS-SERVICE/address/" + candidateUID, AddressVO.class);
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        responseTemplateVO.setCandidate(candidate);
        responseTemplateVO.setAddressVO(addressVO);
        return responseTemplateVO;
    }
}
