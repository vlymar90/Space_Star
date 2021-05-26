package com.gb.lymar.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;
import com.gb.lymar.base.BaseScreen;

public class MenuScreen extends BaseScreen {
    private Texture img;
    private Texture object;
    private Vector2 pos;
    private Vector2 speed;
    private Vector2 endPos;


    @Override
    public void show() {
        super.show();
        img = new Texture("startgame.jpg");
        object = new Texture("raketa.png");
        pos = new Vector2();
        speed = new Vector2(1, 1);
        endPos = new Vector2();

    }

    @Override
    public void render(float delta) {
        super.render(delta);
        ScreenUtils.clear(1, 0, 0, 1);
        batch.begin();
        if (pos.x != endPos.x && pos.y != endPos.y) {
            getDirection();
            pos.add(speed);
        }
        batch.draw(img, 0, 0);
        batch.draw(object, pos.x, pos.y);
        batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();
        img.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        System.out.println("hi");
        endPos.set(screenX, Gdx.graphics.getHeight() - screenY);
        return super.touchDown(screenX, screenY, pointer, button);
    }
}
