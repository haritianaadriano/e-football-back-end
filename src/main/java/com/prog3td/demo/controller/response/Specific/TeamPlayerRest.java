package com.prog3td.demo.controller.response.Specific;

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
public class TeamPlayerRest {
    private Long id;
    private String name;
}
