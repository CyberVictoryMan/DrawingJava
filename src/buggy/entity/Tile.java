package buggy.entity;

import java.awt.Color;
import java.awt.Graphics;

import buggy.main.Data;

public class Tile {
	public static void draw(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		//rect1
		g.drawRect(0, 0, 640, 360);
		g.fillRect(0, 0, 640, 360);
		//rect2
		g.drawRect(640, 0, 640, 360);
		g.fillRect(640, 0, 640, 360);
		//rect3
		g.drawRect(0, 360, 640, 360);
		g.fillRect(0, 360, 640, 360);
		//rect4
		g.drawRect(640, 360, 640, 360);
		g.fillRect(640, 360, 640, 360);
		
		g.setColor(Color.GRAY);
		//rect1
		g.drawRect(10, 10, (1280 / 2) - 20, (720 / 2) - 20);
		g.fillRect(10, 10, (1280 / 2) - 20, (720 / 2) - 20);
		//rect2
		g.drawRect(650, 10, (1280 / 2) - 40, (720 / 2) - 20);
		g.fillRect(650, 10, (1280 / 2) - 40, (720 / 2) - 20);
		//rect3
		g.drawRect(10, 370, (1280 / 2) - 20, (720 / 2) - 60);
		g.fillRect(10, 370, (1280 / 2) - 20, (720 / 2) - 60);
		//rect4
		g.drawRect(650, 370, (1280 / 2) - 40, (720 / 2) - 60);
		g.fillRect(650, 370, (1280 / 2) - 40, (720 / 2) - 60);
		
		if(Data.currentTile == 1) {
			g.setColor(Color.DARK_GRAY);
			g.drawRect(0, 0, 640, 360);
			g.fillRect(0, 0, 640, 360);
		}
	}
}
