package karo7494.demo.repos;

import karo7494.demo.entities.Candidate;
import karo7494.demo.entities.Party;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CandidateRepository extends CrudRepository<Candidate, Integer> {
    List<Candidate> findCandidateById(int id);
    List<Candidate> findCandidateByName(String name);
    List<Candidate> findCandidateByLastName(String lastName);
    List <Candidate> findCandidateByPartyId (int partyId);
}

