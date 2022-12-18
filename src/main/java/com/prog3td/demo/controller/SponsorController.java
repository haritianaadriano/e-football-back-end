package com.prog3td.demo.controller;

import com.prog3td.demo.controller.mapper.SponsorRestMapper;
import com.prog3td.demo.controller.response.Create.CreateSponsor;
import com.prog3td.demo.model.Sponsor;
import com.prog3td.demo.service.SponsorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class SponsorController {
    private SponsorService sponsorService;
    private SponsorRestMapper mapper;

    @GetMapping("/sponsors")
    public List<Sponsor> getSponsors(){
        return sponsorService.getSponsors();
    }

    @PostMapping("/sponsors")
    public List<Sponsor> createSponsor(@RequestBody List<CreateSponsor> toCreate){
        List<Sponsor> rest = toCreate
                .stream()
                .map(mapper::toDomain)
                .toList();
        return sponsorService.createSponsors(rest);
    }
}
