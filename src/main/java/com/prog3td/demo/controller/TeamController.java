package com.prog3td.demo.controller;

import com.prog3td.demo.controller.mapper.TeamRestMapper;
import com.prog3td.demo.controller.response.Create.CreateTeam;
import com.prog3td.demo.controller.response.Update.UpdateTeam;
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
    public List<TeamRest> getTeam(){
        return teamService.getTeam()
                .stream()
                .map(mapper::toRest)
                .toList();
    }

    @PostMapping("/teams")
    public List<TeamRest> createTeam(@RequestBody List<CreateTeam> toCreate){
        List<Team> rest = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return teamService.createTeam(rest).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/teams")
    public List<TeamRest> updateTeam(@RequestBody List<UpdateTeam> toUpdate){
        List<Team> rest = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return teamService.updateTeam(rest).stream()
                .map(mapper::toRest)
                .toList();
    }
}
