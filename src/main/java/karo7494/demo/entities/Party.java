package karo7494.demo.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="party")
public class Party {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String abbreviation;




    @OneToMany(mappedBy = "party",fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    @JsonIgnore
    List<Candidate> candidates = new ArrayList<>();


    public Party(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

}


/*@OneToMany( targetEntity = Candidate.class, cascade = CascadeType.ALL)
@JoinColumn(name = "party_id", referencedColumnName = "id")*/