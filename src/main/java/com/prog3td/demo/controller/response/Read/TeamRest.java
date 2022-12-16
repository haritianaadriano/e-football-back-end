package com.prog3td.demo.controller.response.Read;

import com.prog3td.demo.model.Player;
import com.prog3td.demo.model.Sponsor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class TeamRest {
    private Long id;
    private String name;
    private List<Player> players;
    private List<Sponsor> sponsors;
}
