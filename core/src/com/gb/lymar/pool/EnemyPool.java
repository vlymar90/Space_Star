package com.gb.lymar.pool;

import com.badlogic.gdx.audio.Sound;
import com.gb.lymar.base.SpritesPool;
import com.gb.lymar.math.Rect;
import com.gb.lymar.sprite.EnemyShip;

public class EnemyPool extends SpritesPool<EnemyShip> {
    private final Rect worldBounds;
    private final BulletPool bulletPool;
    private final Sound bulletSound;

    public EnemyPool(Rect worldBounds, BulletPool bulletPool, Sound bulletSound) {
        this.worldBounds = worldBounds;
        this.bulletPool = bulletPool;
        this.bulletSound = bulletSound;
    }

    @Override
    protected EnemyShip newObject() {
        return new EnemyShip(worldBounds, bulletPool, bulletSound);
    }
}
