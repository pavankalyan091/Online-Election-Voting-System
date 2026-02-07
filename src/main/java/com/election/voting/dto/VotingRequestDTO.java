package com.election.voting.dto;

import lombok.Data;

@Data
public class VotingRequestDTO {
    private Long userId;
    private Long candidateId;
}
