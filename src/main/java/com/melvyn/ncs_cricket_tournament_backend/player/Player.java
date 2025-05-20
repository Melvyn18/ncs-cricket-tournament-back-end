package com.melvyn.ncs_cricket_tournament_backend.player;

import com.melvyn.ncs_cricket_tournament_backend.team.Team;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Player {
    @Id
    private String playerId;
    private String playerName;
    private Integer basePrice;
    private Integer soldPrice;

    private Integer rank;
    private String gender;

    @ManyToOne
    @JoinColumn(name = "teamId")
    private Team team;

    public Player() {
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

    public Integer getSoldPrice() {
        return soldPrice;
    }

    public void setSoldPrice(Integer soldPrice) {
        this.soldPrice = soldPrice;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTeam() {
        return team != null ? team.getTeamId() : null;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId='" + playerId + '\'' +
                ", playerName='" + playerName + '\'' +
                ", basePrice=" + basePrice +
                ", soldPrice=" + soldPrice +
                ", rank=" + rank +
                ", gender='" + gender + '\'' +
                '}';
    }
}
