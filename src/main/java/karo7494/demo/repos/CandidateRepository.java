package karo7494.demo.repos;

import karo7494.demo.entities.Candidate;
import karo7494.demo.entities.Party;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, Integer> {
    List<Candidate> findCandidatesById(int id);
    List<Candidate> findCandidatesByName(String name);
    List<Candidate> findCandidatesByLastName(String lastName);
    List <Candidate> findCandidatesByParty (Party party);
    List <Candidate> findCandidatesByPartyId (int partyId);
    Candidate findCandidateById (int id);

}

