package com.prog3td.demo.repository;

import com.prog3td.demo.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, Long> {
}
