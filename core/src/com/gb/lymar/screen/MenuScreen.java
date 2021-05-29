package com.gb.lymar.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;
import com.gb.lymar.base.BaseScreen;
import com.gb.lymar.math.Rect;
import com.gb.lymar.sprite.Background;
import com.gb.lymar.sprite.Spaceship;


public class MenuScreen extends BaseScreen {
    private Texture bg;
    private Texture rkt;
    private Background background;
    private Spaceship spaceship;

    @Override
    public void show() {
        super.show();
        bg = new Texture("startgame.jpg");
        rkt = new Texture("raketa.png");
        background = new Background(bg);
        spaceship = new Spaceship(rkt);
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        background.resize(worldBounds);
        spaceship.resize(worldBounds);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        ScreenUtils.clear(0.33f, 0.45f, 0.68f, 1);
        batch.begin();
        background.draw(batch);
        spaceship.draw(batch);
        batch.end();
        spaceship.setSpeed();
    }

    @Override
    public void dispose() {
        super.dispose();
        bg.dispose();
        rkt.dispose();
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        spaceship.touchDown(touch, 0, 0);
        return false;
    }
}
