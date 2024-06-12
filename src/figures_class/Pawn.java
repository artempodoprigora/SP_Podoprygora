package figures_class;
import java.util.ArrayList;

public class Pawn extends figures {
	public boolean moveCheck(int oldX, int oldY, int newX, int newY, Pawn pawn ) {
		oldX = pawn.getX();
		oldY = pawn.getY();
		
		if(oldX == 1 && newX - oldX == 1 || newX - oldX == 2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public Pawn(int x, int y, boolean black){
		this.setX(x);
		this.setY(y);
		this.setBlack(black);
		this.setValue(1);
		this.setBeatable(true);
	}
	
	public static void InitializePawn(int y, ArrayList<figures> figures, boolean[][] field) {
		for (int x = 0; x < 7; x++) {
			if(y == 0) {
				Pawn pawn = new Pawn(x, y, false);
				figures.add(pawn);
				field[x][y] = true;
			}
			else if(y == 7) {
				Pawn pawn = new Pawn(x, y, true);
				figures.add(pawn);
				field[x][y] = true;
			}
		}
	}
}
