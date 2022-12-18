package com.prog3td.demo.controller.mapper;

import com.prog3td.demo.controller.response.Create.CreateSponsor;
import com.prog3td.demo.model.Sponsor;
import org.springframework.stereotype.Component;

@Component
public class SponsorRestMapper {
    public Sponsor toDomain(CreateSponsor rest){
        return Sponsor.builder()
                .name(rest.getName())
                .build();
    }
}
