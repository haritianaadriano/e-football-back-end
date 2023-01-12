package com.prog3td.demo.controller.response.Update;

import com.prog3td.demo.model.Team;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UpdateMatch {
    private Long id;
    private LocalDate date;
    private String stadium;
    private Team teamOne;
    private Team teamTwo;
}
