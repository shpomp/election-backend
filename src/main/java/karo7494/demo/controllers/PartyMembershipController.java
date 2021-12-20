package karo7494.demo.controllers;

import karo7494.demo.dtos.PartyMembershipDTO;
import karo7494.demo.entities.Candidate;
import karo7494.demo.entities.Party;
import karo7494.demo.repos.CandidateRepository;
import karo7494.demo.repos.PartyRepository;
import karo7494.demo.services.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin( maxAge = 3600)
@RestController
public class PartyMembershipController {
    @Autowired
    private PartyRepository partyRepository;

    @Autowired
    private CandidateRepository candidateRepository;

    CandidateService candidateService;

    public PartyMembershipController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @PostMapping("/add_candidate")
    public Party addCandidate (@RequestBody PartyMembershipDTO request){
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

   /* @GetMapping("/candidates/parties/{id}")
    List<Candidate> getPartyCandidates(@RequestParam(required = false) Party party){
        return candidateService.getCandidates(party);
    }*/

    @GetMapping("/candidates/parties/{id}")
    List<Candidate> getPartyCandidates( @PathVariable Integer id){
        return candidateService.getCandidates(id);
    }


}
