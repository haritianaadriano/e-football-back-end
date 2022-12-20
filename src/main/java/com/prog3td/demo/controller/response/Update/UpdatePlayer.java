package com.prog3td.demo.controller.response.Update;

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
public class UpdatePlayer {
    private Long id;
    private String name;
    private Long number;
    private TeamPlayerRest team;
}
