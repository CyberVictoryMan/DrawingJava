package buggy.main;

import java.awt.Canvas;
import java.awt.event.KeyListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

import buggy.input.KeyListenerr;
import buggy.input.MouseeListener;

public class Main {
	public static Canvas canvas = new Canvas();
	public static Canvas getCanvas() {
		return canvas;
	}
	static KeyListener key = new KeyListenerr();
	static MouseMotionListener mouse = new MouseeListener();
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Buggy Game");
		frame.setSize(1280, 720);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setFocusable(true);
		frame.addMouseMotionListener(mouse);
		frame.addKeyListener(key);
		frame.add(canvas);
		boolean running = true;
		while(running) {
			Loop.tick();
		}
	}
}
