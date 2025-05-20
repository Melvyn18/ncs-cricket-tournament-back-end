package com.melvyn.ncs_cricket_tournament_backend.player;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.security.Permission;
import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, String> {
    Player findTopByOrderBySoldPriceDesc();

    Player findTopByOrderByRankDesc();

    List<Player> findByTeamIsNull(Sort sort);

    long countByTeamIsNotNull();
}
