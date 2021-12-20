package karo7494.demo.controllers;

import karo7494.demo.dtos.PartyMembership;
import karo7494.demo.entities.Candidate;
import karo7494.demo.entities.Party;
import karo7494.demo.repos.CandidateRepository;
import karo7494.demo.repos.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
public class PartyMembershipController {
    @Autowired
    private PartyRepository partyRepository;

    @Autowired
    private CandidateRepository candidateRepository;

    @PostMapping("/add_candidate")
    public Party addCandidate (@RequestBody PartyMembership request){
        return partyRepository.save(request.getParty());
    }

    @GetMapping("/parties")
    public List<Party> getAllParties(){
        return (List<Party>) partyRepository.findAll();
    }

    @GetMapping("/candidates")
    public List<Candidate> getAllCandidates(){
        return (List<Candidate>) candidateRepository.findAll();
    }
}
