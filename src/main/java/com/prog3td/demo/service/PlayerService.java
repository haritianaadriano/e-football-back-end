package com.prog3td.demo.service;

import com.prog3td.demo.model.Player;
import com.prog3td.demo.repository.PlayerRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlayerService {
    private PlayerRepository playerRepository;

    //GET
    public List<Player> getPlayers(Long page, Long pageSize){
        if(page != null && pageSize != null){
            Pageable pageable = PageRequest.of(Math.toIntExact(page - 1), Math.toIntExact(pageSize));
            return playerRepository.findAll(pageable).stream().toList();
        }
        else{
            return playerRepository.findAll();
        }
    }
    //POST
    public List<Player> createPlayer(List<Player> toCreate){
        return playerRepository.saveAll(toCreate);
    }
    //PUT
    public List<Player> updatePlayer(List<Player> toUpdate){
        return playerRepository.saveAll(toUpdate);
    }
    //DELETE
    public ResponseEntity<Player> deletePlayer(Long id){
        Optional<Player> optional = playerRepository.findById(id);
        if(!optional.isEmpty()){
            playerRepository.delete(optional.get());
            Player player = optional.get();
            return new ResponseEntity<>(player, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(new Player(), HttpStatus.NOT_FOUND);
        }
    }
}
