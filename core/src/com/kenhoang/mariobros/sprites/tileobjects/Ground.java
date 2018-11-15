package com.kenhoang.mariobros.sprites.tileobjects;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.math.Rectangle;
import com.kenhoang.mariobros.screens.PlayScreen;
import com.kenhoang.mariobros.sprites.Mario;

public class Ground extends InteractiveTileObject {
    public Ground(PlayScreen screen, MapObject object) {
        super(screen, object);
        fixture.setUserData(this);
    }

    @Override
    public void onHeadHit(Mario mario) {
        Gdx.app.log("Ground", "Collision");
    }
}
