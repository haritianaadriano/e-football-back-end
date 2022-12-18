package com.prog3td.demo.controller.mapper;

import com.prog3td.demo.controller.response.Create.CreateTeam;
import com.prog3td.demo.model.Team;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

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
}
