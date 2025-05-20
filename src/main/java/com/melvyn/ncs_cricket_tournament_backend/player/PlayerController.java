package com.melvyn.ncs_cricket_tournament_backend.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping("players")
    public List<Player> retrieveAllPlayersSorted() {

        return playerService.retrieveAllPlayersSorted();
    }

    @PutMapping("player")
    public void updatePlayer(@RequestBody Player player) {

        playerService.updatePlayer(player);
    }

    @GetMapping("players/highest-bid")
    public Player retrieveHighestBidPlayer(){
        return playerService.retrieveHighestBidPlayer();
    }

    @GetMapping("players/highest-rank")
    public Player retrieveHighestRankPlayer(){
        return playerService.retrieveHighestRankPlayer();
    }

    @GetMapping("players/sold-count")
    public long retrieveSoldPlayerCount(){
        return playerService.retrieveSoldPlayerCount();
    }

    @GetMapping("players/count")
    public long retrieveTotalPlayerCount(){
        return playerService.retrieveTotalPlayerCount();
    }
}
