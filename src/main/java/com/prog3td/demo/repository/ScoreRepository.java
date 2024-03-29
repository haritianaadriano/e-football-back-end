package com.prog3td.demo.repository;

import com.prog3td.demo.model.Match;
import com.prog3td.demo.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScoreRepository extends JpaRepository<Score, Long> {
    List<Score> findAllByMatch(Match match);
}
