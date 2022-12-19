package com.prog3td.demo.controller;

import com.prog3td.demo.controller.mapper.MatchRestMapper;
import com.prog3td.demo.controller.response.Create.CreateMatch;
import com.prog3td.demo.controller.response.Update.UpdateMatch;
import com.prog3td.demo.model.Match;
import com.prog3td.demo.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MatchController {
    private MatchService matchService;
    private MatchRestMapper mapper;

    @GetMapping("/matchs")
    public List<Match> getMatch(){
        return matchService.getMatch();
    }

    @PostMapping("/matchs")
    public List<Match> createMatch(@RequestBody List<CreateMatch> toCreate){
        List<Match> rest = toCreate.stream()
                .map(mapper::toDomain)
                .toList();
        return matchService.createMatch(rest);
    }

    @PutMapping("/matchs")
    public List<Match> updateMatch(@RequestBody List<UpdateMatch> toUpdate){
        List<Match> rest = toUpdate.stream()
                .map(mapper::toDomain)
                .toList();
        return matchService.updateMatch(rest);
    }
}
