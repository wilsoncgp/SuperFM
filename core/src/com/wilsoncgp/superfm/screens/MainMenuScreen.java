package com.wilsoncgp.superfm.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.wilsoncgp.superfm.SuperFMGame;
import com.wilsoncgp.superfm.screens.base.BaseScreen;

/**
 * Created by Liam on 12/10/2014.
 */
public class MainMenuScreen extends BaseScreen {

    final SuperFMGame game;

    OrthographicCamera camera;
    Rectangle screenRectangle;
    int padding;

    Texture startButtonImage;
    Rectangle startButtonRectangle;

    public MainMenuScreen(final SuperFMGame game) {
        this.game = game;

        // Set up the camera
        screenRectangle = new Rectangle(0, 0, 480, 800);
        camera = new OrthographicCamera();
        camera.setToOrtho(false, screenRectangle.width, screenRectangle.height);
        padding = 20;

        // Load button images and rectangles
        startButtonImage = new Texture(Gdx.files.internal("buttons/start_button.png"));
        startButtonRectangle = new Rectangle(screenRectangle.x + padding, screenRectangle.y + padding,
                                             screenRectangle.width - (2 * padding), screenRectangle.height - (2 * padding));
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.5f, 0.5f, 0.5f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        camera.update();

        game.batch.setProjectionMatrix(camera.combined);

        game.batch.begin();
        game.batch.draw(startButtonImage, startButtonRectangle.x, startButtonRectangle.y,
                                          startButtonRectangle.width, startButtonRectangle.height);
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void update() {

    }

    @Override
    public void draw(SpriteBatch batch) {

    }
}
