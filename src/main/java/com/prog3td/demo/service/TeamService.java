package com.prog3td.demo.service;

import com.prog3td.demo.model.Team;
import com.prog3td.demo.repository.TeamRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamService {
    private TeamRepository teamRepository;

    //GET
    public List<Team> getTeam(){
        return teamRepository.findAll();
    }
    //POST
    public List<Team> createTeam(List<Team> toCreate){
        return teamRepository.saveAll(toCreate);
    }
    //PUT
    public List<Team> updateTeam(List<Team> toUpdate){
        return teamRepository.saveAll(toUpdate);
    }
    //DELETE

}
