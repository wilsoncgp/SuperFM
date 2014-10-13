package com.wilsoncgp.superfm.buttons.base;

import com.badlogic.gdx.math.Rectangle;
import com.wilsoncgp.superfm.SuperFMGame;
import com.wilsoncgp.superfm.base.UpdatableObject;

/**
 * Created by Liam on 13/10/2014.
 */
public abstract class Button implements UpdatableObject {
    protected Rectangle rectangle;

    public Button(int x, int y, int width, int height) {
        this.rectangle = new Rectangle(x, y, width, height);
    }

    public Button(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public abstract boolean containsPoint(float x, float y);

    public abstract void onTap(SuperFMGame game);
}
