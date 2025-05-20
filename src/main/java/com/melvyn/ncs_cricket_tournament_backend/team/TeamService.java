package com.melvyn.ncs_cricket_tournament_backend.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    public List<Team> retrieveAllTeams() {

        return teamRepository.findAll(Sort.by("teamId").ascending());
    }

    public Team retrieveTeam(String teamName) {

        return teamRepository.findByTeamName(teamName);
    }

    public void updateTeam(Team team) {

        teamRepository.save(team);
    }
}
