package com.prog3td.demo.service;

import com.prog3td.demo.model.Match;
import com.prog3td.demo.repository.MatchRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MatchService {
    private MatchRepository matchRepository;

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
}
