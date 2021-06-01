package com.gb.lymar.sprite;


import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.gb.lymar.base.Sprite;
import com.gb.lymar.math.Rect;


public class Spaceship extends Sprite {
    private static final float PADDING = 0.03f;
    private Vector2 v;
    private Vector2 touch;

    public Spaceship(TextureRegion textureRegion) {
        super(textureRegion);

        v = new Vector2();
        touch = new Vector2();
    }

    @Override
    public void resize(Rect worldBounds) {
        super.resize(worldBounds);
        setHeightProportion(0.2f);
        setBottom(worldBounds.getBottom() + PADDING);

    }

    @Override
    public void update(float delta) {
        super.update(delta);
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        v.set(touch.cpy().sub(pos)).setLength(0.5f);
        this.touch = touch;
        return false;
    }

    public Vector2 getV() {
        return v;
    }

    public void setSpeed() {
        if (touch.sub(pos).len() <= v.len()) {
            pos.set(touch);
            v.setZero();
        } else {
            pos.add(v);
        }
    }
}
