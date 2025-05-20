package com.melvyn.ncs_cricket_tournament_backend.currentplayer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CurrentPlayer {
    @Id
    private String id;
    private Integer currentPlayer;

    public CurrentPlayer() {
    }

    public CurrentPlayer(String id, Integer currentPlayer) {
        this.id = id;
        this.currentPlayer = currentPlayer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Integer currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    @Override
    public String toString() {
        return "CurrentPlayer{" +
                "id='" + id + '\'' +
                ", currentPlayer=" + currentPlayer +
                '}';
    }
}
