package com.prog3td.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "sponsor")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Sponsor {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long idSponsor;
    private String name;

    //JPA: relation --------------------
    @JsonIgnore
    @ManyToMany(mappedBy = "sponsors")
    private List<Team> teams;
}
