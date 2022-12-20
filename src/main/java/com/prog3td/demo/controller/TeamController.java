package com.prog3td.demo.controller;

import com.prog3td.demo.controller.mapper.TeamRestMapper;
import com.prog3td.demo.controller.response.Create.CreateTeam;
import com.prog3td.demo.model.Team;
import com.prog3td.demo.service.TeamService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private TeamService teamService;
    private TeamRestMapper mapper;

    @GetMapping("/teams")
    public List<Team> getTeam(){
        return teamService.getTeam()
                .stream()
                .map(mapper::toRest)
                .toList();
    }

    @PostMapping("/teams")
    public List<Team> createTeam(@RequestBody List<CreateTeam> toCreate){
        List<Team> rest = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return teamService.createTeam(rest);
    }

    @PutMapping("/teams")
    public List<Team> updateTeam(@RequestBody List<Team> toUpdate){
        return teamService.updateTeam(toUpdate);
    }
}
