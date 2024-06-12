package figures_class;

public class Knight extends figures{
	//public boolean moveCheck(int oldX, int oldY, int newX, int newY, Knight knight) {
		
	//}
	
	Knight(int x, int y){
		this.setX(x);
		this.setY(y);
		this.setValue(3);
		this.setBeatable(true);
	}
}
