package com.gb.lymar.sprite;

import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.gb.lymar.base.Sprite;
import com.gb.lymar.math.Rect;

public class GameOver extends Sprite {
    private static final float HEIGHT = 0.08f;

    public GameOver(TextureAtlas atlas) {
        super(atlas.findRegion("message_game_over"));
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(HEIGHT);
        setTop(worldBounds.pos.y + 0.1f);
    }
}
