package com.prog3td.demo.controller.response.Create;

import com.prog3td.demo.model.Team;
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
public class CreateMatch {
    private LocalDateTime dateTime;
    private String stadium;
    private Team teamOne;
    private Team teanTwo;
}
