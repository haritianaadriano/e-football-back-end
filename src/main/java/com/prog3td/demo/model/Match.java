package com.prog3td.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

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
    private Long idPlay;
    private LocalDate date;
    @JsonIgnore
    private String stadium;
    @ManyToOne
    @JoinColumn(name = "team_one")
    private Team teamOne;
    @ManyToOne
    @JoinColumn(name = "team_two")
    private Team teamTwo;
}
