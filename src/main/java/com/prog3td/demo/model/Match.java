package com.prog3td.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;


@Entity
@Table(name = "play_against")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class Match {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int idPlayAgainst;
    @OneToOne
    @JoinColumn(name = "team_one")
    private Team teamOne;
    @OneToOne
    @JoinColumn(name = "team_two")
    private Team teamTwo;
}
