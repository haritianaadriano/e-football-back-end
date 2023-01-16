package com.prog3td.demo.service;

import com.prog3td.demo.controller.response.Read.MatchRest;
import com.prog3td.demo.model.Match;
import com.prog3td.demo.model.Score;
import com.prog3td.demo.repository.MatchRepository;
import com.prog3td.demo.repository.ScoreRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class MatchService {
    private MatchRepository matchRepository;
    private ScoreRepository scoreRepository;

    //GET
    public List<Match> getMatch(){
        return matchRepository.findAll();
    }
    //POST
    public List<Match> createMatch(List<Match> toCreate){
        return matchRepository.saveAll(toCreate);
    }
    //PUT
    public List<Match> updateMatch(List<Match> toUpdate){
        return matchRepository.saveAll(toUpdate);
    }

    //function who is going to search match relation with team and score
    public List<Score> findScore(Long idMatch, Long idTeam){
        Match thisMatch = matchRepository.findById(idMatch)
                .orElseThrow(()->new NullPointerException("match not found"));
        List<Score> scoreByMatch = scoreRepository.findAllByMatch(thisMatch);
        return scoreByMatch
                .stream()
                .filter(score -> score.getPlayer().getTeam().equals(idTeam))
                .toList();
    }
}
