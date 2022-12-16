package com.prog3td.demo.controller;

import com.prog3td.demo.controller.mapper.MatchRestMapper;
import com.prog3td.demo.controller.response.Create.CreateMatch;
import com.prog3td.demo.controller.response.Read.MatchRest;
import com.prog3td.demo.controller.response.Update.UpdateMatch;
import com.prog3td.demo.model.Match;
import com.prog3td.demo.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class MatchController {
    private MatchService matchService;
    private MatchRestMapper mapper;

    @GetMapping("/matchs")
    public List<MatchRest> getMatch(){
        return matchService.getMatch()
                .stream()
                .map(mapper::toRest)
                .toList();
    }

    @PostMapping("/matchs")
    public List<MatchRest> createMatch(@RequestBody List<CreateMatch> toCreate){
        List<Match> rest = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return matchService.createMatch(rest).stream()
                .map(mapper::toRest)
                .toList();
    }

    @PutMapping("/matchs")
    public List<MatchRest> updateMatch(@RequestBody List<UpdateMatch> toUpdate){
        List<Match> rest = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return matchService.updateMatch(rest).stream()
                .map(mapper::toRest)
                .toList();
    }
}
