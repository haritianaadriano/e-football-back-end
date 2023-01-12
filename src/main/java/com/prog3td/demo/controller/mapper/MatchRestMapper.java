package com.prog3td.demo.controller.mapper;

import com.prog3td.demo.controller.response.Create.CreateMatch;
import com.prog3td.demo.controller.response.Update.UpdateMatch;
import com.prog3td.demo.model.Match;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MatchRestMapper {

    public Match toDomain(CreateMatch rest){
        return Match.builder()
                .teamOne(rest.getTeamOne())
                .teamTwo(rest.getTeanTwo())
                .date(rest.getDate())
                .stadium(rest.getStadium())
                .build();
    }
    public Match toDomain(UpdateMatch rest){
        return Match.builder()
                .idPlay(rest.getId())
                .teamOne(rest.getTeamOne())
                .teamTwo(rest.getTeamTwo())
                .stadium(rest.getStadium())
                .date(rest.getDate())
                .build();
    }
}
