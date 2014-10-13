package com.wilsoncgp.superfm.buttons;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.wilsoncgp.superfm.SuperFMGame;
import com.wilsoncgp.superfm.buttons.base.Button;
import com.wilsoncgp.superfm.screens.MatchScreen;

/**
 * Created by Liam on 13/10/2014.
 */
public class StartGameButton extends Button{

    public StartGameButton(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public StartGameButton(Rectangle rectangle) {
        super(rectangle);
    }

    @Override
    public boolean containsPoint(float x, float y) {
        return this.rectangle.contains(x, y);
    }

    @Override
    public void onTap(SuperFMGame game) {
        game.setScreen(new MatchScreen(game));
    }

    @Override
    public void update() {
        
    }

    @Override
    public void draw(SpriteBatch batch) {

    }
}
