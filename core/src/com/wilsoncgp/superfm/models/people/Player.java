package com.wilsoncgp.superfm.models.people;

import com.badlogic.gdx.utils.Array;
import com.wilsoncgp.superfm.models.base.Person;
import com.wilsoncgp.superfm.models.enums.Position;

import java.util.Date;

/**
 * Created by Liam on 12/10/2014.
 * Class representing a Player
 */
public class Player extends Person {

    private Array<Position> positions;
    private Position mainPosition;

    /**
     * Player constructor
     * @param name Name of the player
     * @param dateOfBirth Date of Birth of the player
     * @param positions Array of Positions player can play in, first in array is considered main position
     */
    public Player(String name, Date dateOfBirth, Array<Position> positions) {
        super(name, dateOfBirth);
        if(positions.size > 0) {
            this.mainPosition = positions.first();
            this.positions = positions;
        }
    }

    /**
     * Method to set the main position of the player. Position must be in Array of positions.
     * @param position Position to set the Main Position to.
     * @return Boolean value representing whether this method was successful or not. True if successful, false if not successful.
     */
    public boolean setMainPosition(Position position) {
        if(this.positions.contains(position, true)) {
            this.mainPosition = position;
            return true;
        } else {
            return false;
        }
    }
}
