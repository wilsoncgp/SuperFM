package com.wilsoncgp.superfm.models.base;

import com.wilsoncgp.superfm.base.BaseModel;

/**
 * Created by liam.wilson on 16/10/2014.
 */
public class Match extends BaseModel {
    //TODO: Think of link between Teams, Squads and Players
    //
    //Option 1: Players have IDs that both teams and squads access on a per ID basis
    //Option 2: Teams use same array of Players for themselves and their squads, with
    //              the selected status being defined on the player level. Don't like this...
    //private Squad homeTeam;
    //private Squad awayTeam;

    public Match(int id) {
        this.id = id;
    }
}
