package com.wilsoncgp.superfm.buttons;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.sun.glass.ui.Pixels;
import com.wilsoncgp.superfm.SuperFMGame;
import com.wilsoncgp.superfm.buttons.base.Button;
import com.wilsoncgp.superfm.screens.MatchScreen;

import java.awt.Color;

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

        game.setScreen(new MatchScreen(game, new Match()));
    }

    @Override
    public void update() {
        
    }

    @Override
    public void draw(SpriteBatch batch) {
        if(hasTexture()) {
            batch.draw(texture, rectangle.getX(), rectangle.getY(), rectangle.getWidth(), rectangle.getHeight());
        } else {
            ShapeRenderer shapeRenderer = new ShapeRenderer();
            shapeRenderer.setProjectionMatrix(new OrthographicCamera().combined);
            shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
            shapeRenderer.setColor(new com.badlogic.gdx.graphics.Color(0.8f, 0.2f, 0.2f, 1.0f));
            shapeRenderer.rect(this.rectangle.getX(), this.rectangle.getY(), this.rectangle.getWidth(), this.rectangle.getHeight());
        }
    }
}
