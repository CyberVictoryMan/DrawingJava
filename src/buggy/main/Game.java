package buggy.main;

public class Game {
	public static void checkBugInTile() {
		if(Data.bugY > 0) {
			if(Data.bugX > 640) {
				Data.currentTile = 1;
			}
		}
		else {
			Data.currentTile = 0;
		}
	}
	
}
