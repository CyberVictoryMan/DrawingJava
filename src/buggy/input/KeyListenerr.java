package buggy.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import buggy.entity.Bug;

public class KeyListenerr implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if(e.getKeyCode() == KeyEvent.VK_SPACE) {
			Bug.moveBug();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	
}
