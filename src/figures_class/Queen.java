package figures_class;

public class Queen extends figures {

	public boolean moveCheck(int oldX, int oldY, int newX, int newY, Queen queen) {
		oldX = queen.getX();
		oldY = queen.getY();
		if(oldX != newX && oldY == newY) {
			return true;
		}
		else if(oldX == newX && oldY != newY) {
			return true;
		}
		else if(oldX - newX == oldY - newY || oldX + newX == oldY + newY) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	Queen(int x, int y){
		this.setX(x);
		this.setY(y);
		this.setValue(8);
		this.setBeatable(true);
	}
	
}
