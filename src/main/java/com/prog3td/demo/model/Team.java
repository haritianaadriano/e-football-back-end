package com.prog3td.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "team")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class Team {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int idTeam;
    private String name;

    //players: attribute------------------
    @OneToMany(cascade = CascadeType.ALL)
    private List<Player> players;

    //sponsors: attribute----------------
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "have",
            joinColumns = @JoinColumn(name = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "sponsor_id")
    )
    private List<Sponsor> sponsors;
}
