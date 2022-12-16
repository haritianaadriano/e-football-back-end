package com.prog3td.demo.controller.response.Create;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CreatePlayer {
    private String name;
    private Long number;
}
