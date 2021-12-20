package karo7494.demo.dtos;


import com.fasterxml.jackson.annotation.JsonInclude;
import karo7494.demo.entities.Candidate;
import karo7494.demo.entities.Party;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CandidateDTO {

    int id;
    String name;
    String lastName;
    int partyId;

    public CandidateDTO(String name, String lastName, int partyId) {
        this.name = name;
        this.lastName = lastName;
        this.partyId = partyId;
    }

    public CandidateDTO(Candidate candidate) {
        this.id = candidate.getId();
        this.name = candidate.getName();
        this.lastName = candidate.getLastName();
        this.partyId = candidate.getParty().getId();
    }


    public static List<CandidateDTO> candidateDTOSfromCandidate(Iterable<Candidate> candidates){
        List<CandidateDTO> carDTOSlist = new ArrayList<>();
        for(Candidate candidate : candidates){
            CandidateDTO newCandidateDTO = new CandidateDTO(candidate);
            carDTOSlist.add(newCandidateDTO);
        }
        return carDTOSlist;

    }
/*
    public static Candidate candidateFromCandidateDTO(CandidateDTO candidate){
        return new Candidate();
    }*/


}
