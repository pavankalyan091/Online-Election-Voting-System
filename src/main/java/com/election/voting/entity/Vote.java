package com.election.voting.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "votes")
@Data
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name="user_id",unique = true)
    private User user;

    @ManyToOne
    @JoinColumn(name="candidate_id")
    private Candidate candidate;

    private LocalDateTime votedAt=LocalDateTime.now();
}
