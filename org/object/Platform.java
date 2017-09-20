package org.object;

import java.awt.Color;
import java.awt.Graphics;

import org.graphics.Renderer;

public class Platform extends Sprite {

	public Platform(float posX, float posY) {
		super(posX, posY);
		
		width = 300;
		height = 20;
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.green);
		g.drawRect( (int) (posX - width / 2) - (int) Renderer.camX + Renderer.gameWidth / 2,
				(int) (posY - height / 2) - (int) Renderer.camY + Renderer.gameHeight / 2, (int) width, (int) height);
	}

}
