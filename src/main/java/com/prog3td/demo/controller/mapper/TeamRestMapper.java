package com.prog3td.demo.controller.mapper;

import com.prog3td.demo.controller.response.Create.CreateTeam;
import com.prog3td.demo.controller.response.Read.TeamRest;
import com.prog3td.demo.controller.response.Update.UpdateTeam;
import com.prog3td.demo.model.Team;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class TeamRestMapper {
    public TeamRest toRest(Team domain){
        return TeamRest.builder()
                .id(domain.getIdTeam())
                .name(domain.getName())
                .players(domain.getPlayers())
                .sponsors(domain.getSponsors())
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
