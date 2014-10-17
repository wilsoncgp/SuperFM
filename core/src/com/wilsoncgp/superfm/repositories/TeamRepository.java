package com.wilsoncgp.superfm.repositories;

import com.wilsoncgp.superfm.models.base.Team;

/**
 * Created by liam.wilson on 17/10/2014.
 */
public class TeamRepository {
    private String tableName = "Teams";

    public static Team getTeamById(int id) {
        //TODO: As with PlayerRepository, not yet using a repository. This is not functional.
        Team team = new Team(0);
        return team;
    }
}
