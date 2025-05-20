package com.melvyn.ncs_cricket_tournament_backend.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeamController {
    @Autowired
    private TeamService teamService;

    @GetMapping("teams")
    public List<Team> retrieveAllTeams() {

        return teamService.retrieveAllTeams();
    }

    @GetMapping("teams/{teamName}")
    public Team retrieveTeam(@PathVariable String teamName) {

        return teamService.retrieveTeam(teamName);
    }

    @PutMapping("team")
    public void updateTeam(@RequestBody Team team) {

        teamService.updateTeam(team);
    }
}
