package org.game;

import org.graphics.Renderer;
import org.object.Platform;
import org.object.Player;
import org.sound.Sound;
import org.world.World;

public class Game {

	public static void main(String[] args) {
		Sound.sound1.loop(); // song in loop or Sound.sound1.play(); only one time!
		Renderer.init();
		
		World.currentWorld = new World();
		World.currentWorld.sprites.add(new Player(100, 100));
		World.currentWorld.sprites.add(new Platform(200, 200));
	}
	
	public static void quit() {
		System.exit(0);
	}

}
