package com.gb.lymar;

import com.badlogic.gdx.Game;
import com.gb.lymar.screen.MenuScreen;

public class SpaceStar extends Game {
	
	@Override
	public void create () {
        setScreen(new MenuScreen(this));
	}
}
