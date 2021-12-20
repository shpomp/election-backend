package karo7494.demo.services;


import karo7494.demo.entities.Candidate;
import karo7494.demo.entities.Party;
import karo7494.demo.repos.CandidateRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {

    CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }



    public List<Candidate> getCandidates(Integer partyId) {
        if(partyId!=null){
            return candidateRepository.findCandidatesByPartyId(partyId);
        }
        return (List<Candidate>) candidateRepository.findAll();
    }


    public Candidate getCandidate(int id) {
        Candidate candidate = candidateRepository.findCandidateById(id);
        return candidate;
    }


    public Candidate addCandidate(Candidate candidate) {
       return candidateRepository.save(candidate);
    }



    public Candidate editCandidate(Candidate candidateToEdit, int id){
        Candidate candidateInDB = candidateRepository.findCandidateById(id);
        candidateInDB.setName(candidateToEdit.getName());
        candidateInDB.setLastName(candidateToEdit.getLastName());
        candidateInDB.setParty(candidateToEdit.getParty());
        return candidateRepository.save(candidateInDB);
    }

    public void deleteCandidate(int id) {
        candidateRepository.deleteById(id);
    }




}
