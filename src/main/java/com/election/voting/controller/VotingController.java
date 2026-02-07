package com.election.voting.controller;

import com.election.voting.dto.VotingRequestDTO;
import com.election.voting.service.VotingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/votes")
public class VotingController {
    private final VotingService votingService;

    public VotingController(VotingService votingService) {
        this.votingService = votingService;
    }
    @PostMapping("/cast")
    public ResponseEntity<String> casteVote(@RequestBody VotingRequestDTO request){
        String message=votingService.casteVote(request);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

}
