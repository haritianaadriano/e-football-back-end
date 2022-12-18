package com.prog3td.demo.controller.mapper;

import com.prog3td.demo.controller.response.Create.CreateSponsor;
import com.prog3td.demo.controller.response.specific.SponsorTeamRest;
import com.prog3td.demo.model.Sponsor;
import org.springframework.stereotype.Component;

@Component
public class SponsorRestMapper {
    public Sponsor toDomain(CreateSponsor rest){
        return Sponsor.builder()
                .name(rest.getName())
                .build();
    }
    public SponsorTeamRest toTeam(Sponsor domain){
        return SponsorTeamRest.builder()
                .id(domain.getIdSponsor())
                .name(domain.getName())
                .build();
    }
}
