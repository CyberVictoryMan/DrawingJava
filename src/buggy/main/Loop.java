package buggy.main;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import buggy.entity.Bug;
import buggy.entity.Tile;
import buggy.input.KeyListenerr;

public class Loop {
	//vars
	public static BufferStrategy bs;
	public static Graphics g;
	public static void tick() {
		render();
	}
	public static void render() {
		bs = Main.getCanvas().getBufferStrategy();
		if(bs == null){
			Main.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		g.clearRect(0, 0, 1280, 720);
		//start

		Tile.draw(g);
		Bug.draw(g);
		//end
		g.dispose();
		bs.show();
	}
}
