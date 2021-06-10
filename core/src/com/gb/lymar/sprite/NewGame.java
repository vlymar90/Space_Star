package com.gb.lymar.sprite;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.gb.lymar.base.ScaledButton;
import com.gb.lymar.base.Sprite;
import com.gb.lymar.math.Rect;
import com.gb.lymar.screen.GameScreen;

public class NewGame extends ScaledButton {
    private static final float HEIGHT = 0.08f;
    private Game game;

    public NewGame(TextureAtlas atlas, Game game) {
        super(atlas.findRegion("button_new_game"));
        this.game = game;
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(HEIGHT);
        setTop(worldBounds.pos.y + 0.3f);
    }

    @Override
    protected void action() {
        game.setScreen(new GameScreen(game));
    }
}
