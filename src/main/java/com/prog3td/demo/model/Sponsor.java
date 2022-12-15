package com.prog3td.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private int idSponsor;
    private String name;
}
