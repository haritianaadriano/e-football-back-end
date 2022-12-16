package com.prog3td.demo.controller.response.Create;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class CreatePlayer {
    private String name;
    private Long number;
}
