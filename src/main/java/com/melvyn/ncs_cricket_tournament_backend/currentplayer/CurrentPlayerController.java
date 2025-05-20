package com.melvyn.ncs_cricket_tournament_backend.currentplayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CurrentPlayerController {

    @Autowired
    private CurrentPlayerService currentPlayerService;

    @GetMapping("players/current-player")
    public CurrentPlayer retrieveSoldPlayerCount(){
        return currentPlayerService.retrieveSoldPlayerCount();
    }

    @PutMapping("players/current-player")
    public void updateSoldPlayerCount(@RequestBody CurrentPlayer currentPlayer){
        currentPlayerService.updateSoldPlayerCount(currentPlayer);
    }
}
