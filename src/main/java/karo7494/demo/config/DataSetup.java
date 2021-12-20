package karo7494.demo.config;

import karo7494.demo.entities.Candidate;
import karo7494.demo.entities.Party;
import karo7494.demo.repos.CandidateRepository;
import karo7494.demo.repos.PartyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSetup implements CommandLineRunner {

    PartyRepository partyRepository;
    CandidateRepository candidateRepository;

    public DataSetup(PartyRepository partyRepository, CandidateRepository candidateRepository) {
        this.partyRepository = partyRepository;
        this.candidateRepository = candidateRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Party partySD = partyRepository.save(new Party("Socialdemokratiet", "SD"));

        Candidate SDcandidate1 = candidateRepository.save(new Candidate("Marcel", "Meijer", partySD));
        Candidate SDcandidate2 = candidateRepository.save(new Candidate("Michael", "Kristensen", partySD));
        Candidate SDcandidate3 = candidateRepository.save(new Candidate("Helle", "Hansen", partySD));
        Candidate SDcandidate4 = candidateRepository.save(new Candidate("Karina", "Knobelauch", partySD));
        Candidate SDcandidate5 = candidateRepository.save(new Candidate("Stefan", "Hafstein Wolffbrandt", partySD));
        Candidate SDcandidate6 = candidateRepository.save(new Candidate("Robert", "V. Rasmussen", partySD));
        Candidate SDcandidate7 = candidateRepository.save(new Candidate("Pia", "Ramsing", partySD));
        Candidate SDcandidate8 = candidateRepository.save(new Candidate("Anders", "Baun Sørensen", partySD));


        Party partyDFK = partyRepository.save(new Party("Det konservative Folkeparti", "DKF"));

        Candidate DFKcandidate1 = candidateRepository.save(new Candidate("Per", "Urban Olsen", partyDFK));
        Candidate DFKcandidate2 = candidateRepository.save(new Candidate("Peter", "Askjær", partyDFK));
        Candidate DFKcandidate3 = candidateRepository.save(new Candidate("Martin", "Sørensen", partyDFK));
        Candidate DFKcandidate4 = candidateRepository.save(new Candidate("Louise", "Bramstorp", partyDFK));
        Candidate DFKcandidate5 = candidateRepository.save(new Candidate("Sigfred", "Jensen", partyDFK));
        Candidate DFKcandidate6 = candidateRepository.save(new Candidate("Jørn", "C. Nissen", partyDFK));
        Candidate DFKcandidate7 = candidateRepository.save(new Candidate("Morten", "Ø. Kristensen", partyDFK));
        Candidate DFKcandidate8 = candidateRepository.save(new Candidate("Susanne", "Andersen", partyDFK));
        Candidate DFKcandidate9 = candidateRepository.save(new Candidate("Iulian", "V. Paiu", partyDFK));
        Candidate DFKcandidate10 = candidateRepository.save(new Candidate("Per", "Hingel", partyDFK));


        Party partySF = partyRepository.save(new Party("Socialistisk Folkeparti", "SF"));

        Candidate SFcandidate1 = candidateRepository.save(new Candidate("Ulla", "Holm", partySF));
        Candidate SFcandidate2 = candidateRepository.save(new Candidate("Kjeld", "Bønkel", partySF));
        Candidate SFcandidate3 = candidateRepository.save(new Candidate("Anne Grethe", "Olsen", partySF));
        Candidate SFcandidate4 = candidateRepository.save(new Candidate("Lone", "Krag", partySF));
        Candidate SFcandidate5 = candidateRepository.save(new Candidate("Børge", "S. Buur", partySF));


        Party partyDF = partyRepository.save(new Party("Dansk Folkeparti", "DF"));

        Candidate DFcandidate1 = candidateRepository.save(new Candidate("Per", "Mortensen", partyDF));


        Party partyDLP = partyRepository.save(new Party("Danmarks Liberale Parti", "DLP"));

        Candidate DLPcandidate1 = candidateRepository.save(new Candidate("Søren", "Wiese", partyDLP));
        Candidate DLPcandidate2 = candidateRepository.save(new Candidate("Anita", "Elgaard Højholt Olesen", partyDLP));
        Candidate DLPcandidate3 = candidateRepository.save(new Candidate("Carsten", "Bruun", partyDLP));
        Candidate DLPcandidate4 = candidateRepository.save(new Candidate("Mogens", "Exner", partyDLP));
        Candidate DLPcandidate5 = candidateRepository.save(new Candidate("Anja", "Guldborg", partyDLP));
        Candidate DLPcandidate6 = candidateRepository.save(new Candidate("Klaus", "Holdorf", partyDLP));


        Party partyDRG = partyRepository.save(new Party("De Rød-Grønne", "DRG"));

        Candidate DRGcandidate1 = candidateRepository.save(new Candidate("Katrine", "Høegh Mc Quaid", partyDRG));
        Candidate DRGcandidate2 = candidateRepository.save(new Candidate("Jette", "M. Søgaard", partyDRG));
        Candidate DRGcandidate3 = candidateRepository.save(new Candidate("Søren", "Caspersen", partyDRG));
        Candidate DRGcandidate4 = candidateRepository.save(new Candidate("Pia", "Birkmand", partyDRG));


    }

}


















