package com.prog3td.demo.controller.mapper;

import com.prog3td.demo.controller.response.Create.CreatePlayer;
import com.prog3td.demo.controller.response.Read.PlayerRest;
import com.prog3td.demo.controller.response.Update.UpdatePlayer;
import com.prog3td.demo.model.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerRestMapper {
    public PlayerRest toRest(Player domain){
        return PlayerRest.builder()
                .id(domain.getIdPlayer())
                .name(domain.getName())
                .build();
    }
    public Player toDomain(CreatePlayer rest){
        return Player.builder()
                .name(rest.getName())
                .number(rest.getNumber())
                .build();
    }
    public Player toDomain(UpdatePlayer rest){
        return Player.builder()
                .idPlayer(rest.getId())
                .name(rest.getName())
                .number(rest.getNumber())
                .build();
    }
}
