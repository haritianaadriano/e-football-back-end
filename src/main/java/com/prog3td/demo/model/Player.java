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

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "player")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class Player {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long idPlayer;
    private String name;
    private Long number;

    //JPA: relation ------
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "team_id", nullable = false)
    private Team team;
}
