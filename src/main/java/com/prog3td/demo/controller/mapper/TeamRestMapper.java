package com.prog3td.demo.controller.mapper;

import com.prog3td.demo.controller.response.Create.CreateTeam;
import com.prog3td.demo.controller.response.Read.TeamRest;
import com.prog3td.demo.model.Team;
import com.prog3td.demo.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@AllArgsConstructor
public class TeamRestMapper {
    private PlayerRestMapper playerRestMapper;
    private MatchService matchService;
    public Team toDomain(CreateTeam rest){
        return Team.builder()
                .name(rest.getName())
                .players(new ArrayList<>())
                .sponsors(new ArrayList<>())
                .build();
    }
    public Team toRest(Team team){
        //List<Player> PLAYER = team.getPlayers();
        //Collections.sort(PLAYER, Team.playerComparator);
        return Team.builder()
                .idTeam(team.getIdTeam())
                .name(team.getName())
                .players(team.getPlayers())
                .sponsors(team.getSponsors())
                .build();
    }
    public TeamRest toMatch(Team domain){
        return TeamRest.builder()
                .id(domain.getIdTeam())
                .name(domain.getName())
                .score(0)
                .players(domain.getPlayers().stream().map(playerRestMapper::toRest).toList())
                .scorers()
                .sponsors(domain.getSponsors())
                .build();
    }
}
