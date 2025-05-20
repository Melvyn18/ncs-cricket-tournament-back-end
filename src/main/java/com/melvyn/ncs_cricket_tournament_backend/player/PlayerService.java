package com.melvyn.ncs_cricket_tournament_backend.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    public List<Player> retrieveAllPlayersSorted() {

        return playerRepository.findAll(Sort.by("rank").ascending());
//        return playerRepository.findByTeamIsNull(Sort.by("rank").ascending());

    }

    public void updatePlayer(Player player) {

        playerRepository.save(player);
    }

    public Player retrieveHighestBidPlayer(){

        Player highestSoldPlayer = playerRepository.findTopByOrderBySoldPriceDesc();

        if (highestSoldPlayer.getSoldPrice() == null){
            return null;
        } else if (highestSoldPlayer.getSoldPrice() == 0) {
            return null;
        }
        return highestSoldPlayer;
    }

    public Player retrieveHighestRankPlayer(){
        return playerRepository.findTopByOrderByRankDesc();
    }

    public long retrieveSoldPlayerCount(){
        return playerRepository.countByTeamIsNotNull();
    }

    public long retrieveTotalPlayerCount(){
        return playerRepository.count();
    }
}
