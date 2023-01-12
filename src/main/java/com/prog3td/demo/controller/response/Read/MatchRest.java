package com.prog3td.demo.controller.response.Read;

import com.prog3td.demo.model.Score;
import com.prog3td.demo.model.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MatchRest {
    private Long id;
    private LocalDateTime dateTime;
    private String stadium;
    private String score = "0:0";
    private Team teamOne;
    private Team teamTwo;
    private List<Score> teamOneScorers;
    private List<Score> teamTwoScorers;
}
