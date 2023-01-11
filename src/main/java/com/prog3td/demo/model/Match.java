package com.prog3td.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

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
    private LocalDateTime dateTime;
    @JsonIgnore
    private String stadium;
    @ManyToOne
    @JoinColumn(name = "team_one")
    private Team teamOne;
    @ManyToOne
    @JoinColumn(name = "team_two")
    private Team teamTwo;
}
