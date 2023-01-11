package com.prog3td.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Comparator;
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
    private Long idTeam;
    private String name;

    //players: attribute------------------
    @OneToMany(mappedBy = "team")
    @OrderBy("number")
    private List<Player> players;

    //sponsors: attribute----------------
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "have",
            joinColumns = @JoinColumn(name = "team_id"),
            inverseJoinColumns = @JoinColumn(name = "sponsor_id"))
    private List<Sponsor> sponsors;

    public static Comparator<Player> playerComparator = new Comparator<Player>() {
        @Override
        public int compare(Player o1, Player o2) {
            return (int) (o1.getNumber() - o2.getNumber());
        }
    };
}
