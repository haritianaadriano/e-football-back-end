package com.prog3td.demo.controller.response.Read;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class MatchRest {
    private Long id;
    private LocalDateTime dateTime;
    private String stadium;
    private TeamRest teamHome;
    private TeamRest teamAway;
}
