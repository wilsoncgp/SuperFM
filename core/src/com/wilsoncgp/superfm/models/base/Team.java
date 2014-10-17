package com.wilsoncgp.superfm.models.base;

import com.badlogic.gdx.utils.Array;
import com.wilsoncgp.superfm.base.BaseModel;
import com.wilsoncgp.superfm.models.people.Player;

/**
 * Created by liam.wilson on 17/10/2014.
 */
public class Team extends BaseModel {
    private Array<Player> players;

    public Team(int id) {
        this.id = id;
        this.players = new Array<Player>();
    }

    public Team(int id, Array<Player> players) {
        this(id);
        this.players = players;
    }
}
