package com.prog3td.demo.controller.mapper;

import com.prog3td.demo.controller.response.Create.CreateTeam;
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
}
