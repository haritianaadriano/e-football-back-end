package com.prog3td.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "score")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Score {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long idScore;
    private Long time;
    private boolean CSC;
    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;
    //not appear on api
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "match_id")
    private Match match;
}
