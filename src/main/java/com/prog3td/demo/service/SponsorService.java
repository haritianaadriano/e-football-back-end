package com.prog3td.demo.service;

import com.prog3td.demo.model.Sponsor;
import com.prog3td.demo.repository.SponsorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SponsorService {
    private SponsorRepository sponsorRepository;

    public List<Sponsor> getSponsors(){
        return sponsorRepository.findAll();
    }

    public List<Sponsor> createSponsors(List<Sponsor> toCreate){
        return sponsorRepository.saveAll(toCreate);
    }
}
