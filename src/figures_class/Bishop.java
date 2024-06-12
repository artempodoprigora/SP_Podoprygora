package figures_class;

public class Bishop extends figures {
	public boolean moveCheck(int oldX, int oldY, int newX, int newY, Bishop bishop) {
		oldX = bishop.getX();
		oldY = bishop.getY();
		
		if(oldX - newX == oldY - newY || oldX - newX == newY - oldY || newX - oldX == oldY - newY || newX - oldX == newY - oldY) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public Bishop(int x, int y){
		this.setX(x);
		this.setY(y);
		this.setValue(3);
		this.setBeatable(true);
	}

}
