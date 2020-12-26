package com.skills.Skills.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/skill")
public class SkillController {

    @PostMapping("/")
    public ResponseEntity<?> create() {
        return ResponseEntity.ok("Skill Micro Service Called");
    }
}
