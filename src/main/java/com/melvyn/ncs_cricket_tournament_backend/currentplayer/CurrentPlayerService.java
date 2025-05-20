package com.melvyn.ncs_cricket_tournament_backend.currentplayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrentPlayerService {
    @Autowired
    private CurrentPlayerRepository currentPlayerRepository;

    public CurrentPlayer retrieveSoldPlayerCount(){
        return currentPlayerRepository.findById("1").isPresent() ?
                currentPlayerRepository.findById("1").get() :
                null;
    }

    public void updateSoldPlayerCount(CurrentPlayer currentPlayer){

        currentPlayerRepository.save(currentPlayer);
    }
}
