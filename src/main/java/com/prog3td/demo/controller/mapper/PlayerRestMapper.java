package com.prog3td.demo.controller.mapper;

import com.prog3td.demo.controller.response.Create.CreatePlayer;
import com.prog3td.demo.controller.response.Read.PlayerRest;
import com.prog3td.demo.controller.response.Update.UpdatePlayer;
import com.prog3td.demo.model.Player;
import com.prog3td.demo.model.Team;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PlayerRestMapper {
    public PlayerRest toRest(Player domain){
        return PlayerRest.builder()
                .id(domain.getIdPlayer())
                .name(domain.getName())
                .build();
    }
    public Player toDomain(CreatePlayer rest){
        Team TEAM = Team.builder()
                .idTeam(rest.getTeam().getId())
                .name(rest.getTeam().getName())
                .build();
        return Player.builder()
                .name(rest.getName())
                .number(rest.getNumber())
                .team(TEAM)
                .build();
    }
    public Player toDomain(UpdatePlayer rest){
        Team TEAM = Team.builder()
                .idTeam(rest.getTeam().getId())
                .name(rest.getTeam().getName())
                .build();
        return Player.builder()
                .idPlayer(rest.getId())
                .name(rest.getName())
                .number(rest.getNumber())
                .team(TEAM)
                .build();
    }
}
