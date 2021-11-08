package buggy.entity;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import buggy.main.Data;
import buggy.main.Loop;

public class Bug {
	public static void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(Data.bugX, Data.bugY, 25, 25);
	}
	public static void moveBug() {
		Random rand = new Random();
		int X = rand.nextInt(1280) + 0;
		int Y = rand.nextInt(720) + 0;
		while(!(Data.bugX == X)) {
			if(Data.bugX < X) {
				Data.bugX += 1;
				Loop.render();
				if(Data.bugY < Y) {
					Data.bugY += 1;
					Loop.render();
				}
				if(Data.bugY > Y) {
					Data.bugY -= 1;
					Loop.render();
				}
			}
			if(Data.bugX > X) {
				Data.bugX -= 1;
				Loop.render();
				if(Data.bugY < Y) {
					Data.bugY += 1;
					Loop.render();
				}
				if(Data.bugY > Y) {
					Data.bugY -= 1;
					Loop.render();
				}
			}
		}
		System.out.println("X: " + Data.bugX + " Y: " + Data.bugY);
	}
}
