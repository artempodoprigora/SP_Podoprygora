package figures_class;

public class Rook extends figures {
	public boolean moveCheck(int oldX, int oldY, int newX, int newY, Rook rook) {
		oldX = rook.getX();
		oldY = rook.getY();
		
		if(oldX != newX && oldY == newY) {
			return true;
		}
		else if(oldX == newX && oldY != newY ) {
			return true;
		}
		else {
			return false;
		}
	}
	
	Rook(int x, int y){
		this.setX(x);
		this.setY(y);
		this.setValue(5);
		this.setBeatable(true);
	}
}
