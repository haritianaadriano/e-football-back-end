package com.prog3td.demo.controller.response.specific;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class PlayerTeamRest {
    private Long id;
    private String name;
    private Long number;
}
