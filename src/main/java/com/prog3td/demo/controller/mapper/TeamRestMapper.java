package com.prog3td.demo.controller.mapper;

import com.prog3td.demo.controller.response.Create.CreateTeam;
import com.prog3td.demo.controller.response.Read.TeamRest;
import com.prog3td.demo.controller.response.Update.UpdateTeam;
import com.prog3td.demo.model.Player;
import com.prog3td.demo.model.Team;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@AllArgsConstructor
public class TeamRestMapper {
    private PlayerRestMapper playerMapper;
    private SponsorRestMapper sponsorMapper;
    public TeamRest toRest(Team domain){
        List<Player> PLAYERS = domain.getPlayers();
        Collections.sort(PLAYERS, Team.playerComparator);
        return TeamRest.builder()
                .id(domain.getIdTeam())
                .name(domain.getName())
                .players(PLAYERS
                        .stream()
                        .map(playerMapper::toTeam)
                        .toList())
                .sponsors(domain.getSponsors()
                        .stream()
                        .map(sponsorMapper::toTeam)
                        .toList())
                .build();
    }
    public Team toDomain(CreateTeam rest){
        return Team.builder()
                .name(rest.getName())
                .players(new ArrayList<>())
                .sponsors(new ArrayList<>())
                .build();
    }
    public Team toDomain(UpdateTeam rest){
        return Team.builder()
                .idTeam(rest.getId())
                .name(rest.getName())
                .players(rest.getPlayers())
                .sponsors(rest.getSponsors())
                .build();
    }
}
