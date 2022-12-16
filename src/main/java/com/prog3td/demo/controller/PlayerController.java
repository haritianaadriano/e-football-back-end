package com.prog3td.demo.controller;

import com.prog3td.demo.controller.mapper.PlayerRestMapper;
import com.prog3td.demo.controller.response.Create.CreatePlayer;
import com.prog3td.demo.controller.response.Read.PlayerRest;
import com.prog3td.demo.controller.response.Update.UpdatePlayer;
import com.prog3td.demo.model.Player;
import com.prog3td.demo.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private PlayerService playerService;
    private PlayerRestMapper mapper;

    @GetMapping("/players")
    public List<PlayerRest> getPlayers(
            @RequestParam(name = "page", required = false)Long page,
            @RequestParam(name = "page_size", required = false)Long pageSize
    ){
        return playerService.getPlayers(page, pageSize).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PostMapping("/players")
    public List<PlayerRest> createPlayers(@RequestBody List<CreatePlayer> toCreate){
        List<Player> rest = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return playerService.createPlayer(rest).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/players")
    public List<PlayerRest> updatePlayers(@RequestBody List<UpdatePlayer> toUpdate){
        List<Player> rest = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return playerService.updatePlayer(rest).stream()
                .map(mapper::toRest)
                .toList();
    }

    @DeleteMapping("/players/{player_id}")
    public ResponseEntity<Player> deletePlayer(@PathVariable(name = "player_id")Long id){
        return playerService.deletePlayer(id);
    }
}
