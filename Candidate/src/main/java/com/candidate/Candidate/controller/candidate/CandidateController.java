package com.candidate.Candidate.controller.candidate;

import com.candidate.Candidate.commandObject.candidate.CandidateCO;
import com.candidate.Candidate.enums.Enums;
import com.candidate.Candidate.service.candidate.CandidateService;
import com.candidate.Candidate.valueObject.apiResponse.ApiResponseVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping(value = "/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @PostMapping("/")
    public ResponseEntity<?> create(@RequestBody CandidateCO candidateCO) {
        return ResponseEntity.ok(new ApiResponseVO(Enums.ResponseType.SUCCESS, "Candidate Created Successfully", candidateService.create(candidateCO)));
    }

    @GetMapping("/")
    public ResponseEntity<?> fetchAll() {
        return ResponseEntity.ok(new ApiResponseVO(Enums.ResponseType.SUCCESS, "Candidate Fetched Successfully", candidateService.fetchAll()));
    }

    @GetMapping("/{candidateUID}")
    public ResponseEntity<?> fetch(@PathVariable String candidateUID) {
        return ResponseEntity.ok(new ApiResponseVO(Enums.ResponseType.SUCCESS, "Candidate and Address Fetched Successfully", candidateService.fetch(candidateUID)));
    }
}
