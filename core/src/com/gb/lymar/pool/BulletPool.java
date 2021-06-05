package com.gb.lymar.pool;

import com.gb.lymar.base.SpritesPool;
import com.gb.lymar.sprite.Bullet;

public class BulletPool extends SpritesPool<Bullet> {
    @Override
    protected Bullet newObject() {
        return new Bullet();
    }
}
