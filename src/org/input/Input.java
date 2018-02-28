package org.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Input implements KeyListener {

    private static boolean[] lastKeys = new boolean[196];
	private static boolean[] currentKeys = new boolean[196];
	
    public static boolean getKey(int keyCode){
        return currentKeys[keyCode];
	}

	public static boolean getKeyDown (int keyCode){
		return currentKeys[keyCode] && !lastKeys[keyCode];
	}

	public static boolean getKeyUp (int keyCode){
		return !currentKeys[keyCode] && lastKeys[keyCode];
	}
	
	public static void finishInput (){
		lastKeys = currentKeys.clone();
	}

	public void keyPressed(KeyEvent e) {
		currentKeys[e.getKeyCode()] = true;
	}

	public void keyReleased(KeyEvent e) {
		currentKeys[e.getKeyCode()] = false;
    }
    
	public void keyTyped(KeyEvent e) {
		
	}

}