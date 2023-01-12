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
    public List<MatchRest> getMatch(){
        List<Match> allMatches = matchRepository.findAll();
        List<MatchRest> rest = new ArrayList<>();
        for(Match match : allMatches){
            List<Score> scorers = scoreRepository.findAll()
                    .stream()
                    .filter(score -> {
                        return score.getMatch().getIdPlay().equals(match.getIdPlay());
                    })
                    .toList();

            List<Score> TEAM_ONE_SCORERS = scorers
                    .stream()
                    .filter(score -> {
                        return score.getPlayer().getTeam().getIdTeam().equals(match.getTeamOne().getIdTeam());
                    })
                    .toList();

            List<Score> TEAM_TWO_SCORERS = scorers
                    .stream()
                    .filter(score -> {
                        return score.getPlayer().getTeam().getIdTeam().equals(match.getTeamTwo().getIdTeam());
                    })
                    .toList();

            String SCORE = TEAM_ONE_SCORERS.size() + ":" + TEAM_TWO_SCORERS.size();

            MatchRest matchRest = new MatchRest();
            matchRest.setId(match.getIdPlay());
            matchRest.setStadium(match.getStadium());
            matchRest.setDateTime(match.getDateTime());
            matchRest.setTeamOne(match.getTeamOne());
            matchRest.setTeamTwo(match.getTeamTwo());
            matchRest.setTeamOneScorers(TEAM_ONE_SCORERS);
            matchRest.setTeamTwoScorers(TEAM_TWO_SCORERS);
            matchRest.setScore(SCORE);
            rest.add(matchRest);
        }
        return rest;
    }
    //POST
    public List<Match> createMatch(List<Match> toCreate){
        return matchRepository.saveAll(toCreate);
    }
    //PUT
    public List<Match> updateMatch(List<Match> toUpdate){
        return matchRepository.saveAll(toUpdate);
    }
}
