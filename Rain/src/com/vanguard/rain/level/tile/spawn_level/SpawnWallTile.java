package com.vanguard.rain.level.tile.spawn_level;

import com.vanguard.rain.graphics.Screen;
import com.vanguard.rain.graphics.Sprite;
import com.vanguard.rain.level.tile.Tile;

public class SpawnWallTile extends Tile {

	public SpawnWallTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}

	public boolean solid() {
		return true;
	}
}
