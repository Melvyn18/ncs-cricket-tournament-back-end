package com.melvyn.ncs_cricket_tournament_backend.team;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, String> {

    Team findByTeamName(String teamName);
}
