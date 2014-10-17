package com.wilsoncgp.superfm.screens.base;

import com.badlogic.gdx.Screen;
import com.wilsoncgp.superfm.base.DrawableObject;
import com.wilsoncgp.superfm.base.UpdatableObject;

/**
 * Created by Liam on 12/10/2014.
 */
public abstract class BaseScreen implements Screen, UpdatableObject, DrawableObject {
    protected boolean hasButtons;
}
