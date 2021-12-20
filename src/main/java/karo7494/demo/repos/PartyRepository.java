package karo7494.demo.repos;

import karo7494.demo.entities.Party;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartyRepository extends CrudRepository<Party, Integer> {
    List<Party> findPartyById(int id);
    List<Party> findPartyByName(String name);
    List<Party> findPartyByAbbreviation(String abbreviation);

}
