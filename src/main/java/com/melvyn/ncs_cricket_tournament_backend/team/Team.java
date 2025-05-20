package com.melvyn.ncs_cricket_tournament_backend.team;

import com.melvyn.ncs_cricket_tournament_backend.player.Player;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Team {

    @Id
    private String teamId;
    private String teamName;
    private Integer purseRemaining;
    private Integer playersPurchased;
    @OneToMany(mappedBy = "team")
    private List<Player> players;

    public Team() {
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getPurseRemaining() {
        return purseRemaining;
    }

    public void setPurseRemaining(int purseRemaining) {
        this.purseRemaining = purseRemaining;
    }

    public Integer getPlayersPurchased() {
        return playersPurchased;
    }

    public void setPlayersPurchased(int playersPurchased) {
        this.playersPurchased = playersPurchased;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamId='" + teamId + '\'' +
                ", teamName='" + teamName + '\'' +
                ", purseRemaining=" + purseRemaining +
                ", playersPurchased=" + playersPurchased +
                '}';
    }
}
