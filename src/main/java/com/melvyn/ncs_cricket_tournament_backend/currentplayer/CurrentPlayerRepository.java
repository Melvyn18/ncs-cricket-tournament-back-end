package com.melvyn.ncs_cricket_tournament_backend.currentplayer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrentPlayerRepository extends JpaRepository<CurrentPlayer, String> {
}
