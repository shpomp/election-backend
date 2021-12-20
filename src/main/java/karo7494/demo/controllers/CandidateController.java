package karo7494.demo.controllers;


import karo7494.demo.entities.Candidate;
import karo7494.demo.services.CandidateService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="https://election-frenzy.herokuapp.com/", maxAge = 3600)
@RestController
@RequestMapping("/candidate")
public class CandidateController {

    CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/{id}")
    Candidate getCandidate(@PathVariable int id) {
        return candidateService.getCandidate(id);
    }

    @PostMapping
    Candidate addCandidate(@RequestBody Candidate newCandidate) {
        return candidateService.addCandidate(newCandidate);
    }

    @PutMapping("/{id}")
    Candidate editCandidate(@RequestBody Candidate candidateToEdit,@PathVariable int id ) throws Exception {
        return candidateService.editCandidate(candidateToEdit, id);
    }

    @DeleteMapping("/{id}")
    void deleteCandidate(@PathVariable int id){
        candidateService.deleteCandidate(id);
    }


}
