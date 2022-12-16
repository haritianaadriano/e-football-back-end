package com.prog3td.demo.controller.mapper;

import com.prog3td.demo.controller.response.Create.CreateMatch;
import com.prog3td.demo.controller.response.Read.MatchRest;
import com.prog3td.demo.controller.response.Update.UpdateMatch;
import com.prog3td.demo.model.Match;
import org.springframework.stereotype.Component;

@Component
public class MatchRestMapper {
    public MatchRest toRest(Match domain){
        return MatchRest.builder()
                .id(domain.getIdPlay())
                .teamOne(domain.getTeamOne())
                .teamTwo(domain.getTeamTwo())
                .dateTime(domain.getDateTime())
                .build();
    }
    public Match toDomain(CreateMatch rest){
        return Match.builder()
                .teamOne(rest.getTeamOne())
                .teamTwo(rest.getTeanTwo())
                .dateTime(rest.getDateTime())
                .stadium(rest.getStadium())
                .build();
    }
    public Match toDomain(UpdateMatch rest){
        return Match.builder()
                .idPlay(rest.getId())
                .teamOne(rest.getTeamOne())
                .teamTwo(rest.getTeamTwo())
                .stadium(rest.getStadium())
                .dateTime(rest.getDateTime())
                .build();
    }
}
