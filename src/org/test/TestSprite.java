package org.test;

import java.awt.event.KeyEvent;
import java.io.IOException;

import org.input.Input;
import org.object.Sprite;
import org.renderer.Renderer;

public class TestSprite extends Sprite {

    public TestSprite(float posX, float posY){
        super(posX, posY);

        try {
			image = Renderer.loadImage("images/image.png");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public void update(float deltaTime){
        if (Input.getKey(KeyEvent.VK_W)) {
            posY -= 80 * deltaTime;
        }

        if (Input.getKey(KeyEvent.VK_S)) {
            posY += 80 * deltaTime;
        }

        if (Input.getKey(KeyEvent.VK_A)) {
            posX -= 80 * deltaTime;
        }

        if (Input.getKey(KeyEvent.VK_D)) {
            posX += 80 * deltaTime;
        }
    }
}