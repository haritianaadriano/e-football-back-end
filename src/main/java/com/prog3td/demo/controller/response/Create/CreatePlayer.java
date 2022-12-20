package com.prog3td.demo.controller.response.Create;

import com.prog3td.demo.controller.response.Specific.TeamPlayerRest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CreatePlayer {
    private String name;
    private Long number;
    private TeamPlayerRest team;
}
