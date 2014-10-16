package com.wilsoncgp.superfm.repositories;

import com.badlogic.gdx.utils.Array;
import com.wilsoncgp.superfm.models.enums.Position;
import com.wilsoncgp.superfm.models.people.Player;

import java.util.Date;

/**
 * Created by liam.wilson on 16/10/2014.
 */
public final class PlayerRepository {
    private String tableName = "Players";

    public static Player getPlayerById(int id) {
        //TODO: Not using repository as I haven't set it up yet
        //      Expecting to use SQLite but must look for other options.
        Array<Position> positions = new Array<Position>();
        positions.add(Position.GOALKEEPER);
        return new Player("", new Date(), positions);
    }
}
