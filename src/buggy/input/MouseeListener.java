package buggy.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import buggy.main.Data;

public class MouseeListener implements MouseMotionListener{

	@Override
	public void mouseDragged(MouseEvent e) {

		Data.bugX = e.getX();		
		Data.bugY = e.getY();
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Data.bugX = e.getX();		
		Data.bugY = e.getY();
		
	}

}
