package com.election.voting.service;

import com.election.voting.dto.VotingRequestDTO;
import com.election.voting.entity.Candidate;
import com.election.voting.entity.User;
import com.election.voting.entity.Vote;
import com.election.voting.exception.VotingException;
import com.election.voting.repository.CandidateRepository;
import com.election.voting.repository.UserRepository;
import com.election.voting.repository.VoteRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class VotingService {
    private final CandidateRepository candidateRepository;
    private final UserRepository userRepository;
    private final VoteRepository voteRepository;

    @Transactional
    public String casteVote(VotingRequestDTO request){
        Long userId=request.getUserId();
        Long candidateId=request.getCandidateId();

        User user=userRepository.findById(userId).orElseThrow(()-> new VotingException("user not found with ID:"+ userId));

        if(voteRepository.existsByUserId(userId)) {
            throw new VotingException("Alredy you are voted");
        }
        Candidate candidate=candidateRepository.findById(candidateId).orElseThrow(()-> new VotingException("Candidate Not Found This ID:"+candidateId));

        candidate.setVoteCount(candidate.getVoteCount()+1);
        candidateRepository.save(candidate);

        user.setHasVoted(true);
        userRepository.save(user);

        Vote vote = new Vote();
        vote.setUser(user);
        vote.setCandidate(candidate);
        vote.setVotedAt(LocalDateTime.now());
        voteRepository.save(vote);
        return "Success: Vote recorded for " + candidate.getName();
    }

}
