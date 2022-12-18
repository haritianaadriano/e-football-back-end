package com.prog3td.demo.controller.mapper;

import com.prog3td.demo.controller.response.Create.CreateMatch;
import com.prog3td.demo.controller.response.Read.MatchRest;
import com.prog3td.demo.controller.response.Read.TeamRest;
import com.prog3td.demo.controller.response.Update.UpdateMatch;
import com.prog3td.demo.model.Match;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MatchRestMapper {
    private PlayerRestMapper playerRestMapper;
    private SponsorRestMapper sponsorRestMapper;
    public MatchRest toRest(Match domain){
        TeamRest TEAM_ONE = TeamRest.builder()
                .id(domain.getTeamOne().getIdTeam())
                .name(domain.getTeamOne().getName())
                .sponsors(domain.getTeamOne().getSponsors()
                        .stream()
                        .map(sponsorRestMapper::toTeam)
                        .toList())
                .players(domain.getTeamOne().getPlayers()
                        .stream()
                        .map(playerRestMapper::toTeam)
                        .toList())
                .build();
        TeamRest TEAM_TWO = TeamRest.builder()
                .id(domain.getTeamTwo().getIdTeam())
                .name(domain.getTeamTwo().getName())
                .sponsors(domain.getTeamTwo().getSponsors()
                        .stream()
                        .map(sponsorRestMapper::toTeam)
                        .toList())
                .players(domain.getTeamTwo().getPlayers()
                        .stream()
                        .map(playerRestMapper::toTeam)
                        .toList())
                .build();
        return MatchRest.builder()
                .id(domain.getIdPlay())
                .teamOne(TEAM_ONE)
                .teamTwo(TEAM_TWO)
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
