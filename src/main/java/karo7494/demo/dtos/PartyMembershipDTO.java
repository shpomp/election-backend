package karo7494.demo.dtos;

import karo7494.demo.entities.Party;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class PartyMembershipDTO {
    private Party party;
}
