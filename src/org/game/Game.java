package org.game;

import org.object.Platform;
import org.object.Player;
import org.renderer.Renderer;
import org.test.TestSprite;
import org.world.World;

public class Game {
    public static void main(String[] args){
        Renderer.init();

        World.currentWorld = new World();
        World.currentWorld.sprites.add(new Player(100,100));
        World.currentWorld.sprites.add(new Platform(200,200));
    }

    public static void quit(){
        System.exit(0);
    }
}