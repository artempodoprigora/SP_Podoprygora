package figures_class;

public abstract class figures {
	private boolean _beatable;
	public boolean _black;
	private int _x, _y;
	private int _value;
	
	public boolean getBeatable(){
		return _beatable;
	}
	public void setBeatable(boolean beatable) {
		this._beatable = beatable;
	}
	
	public boolean getBlack() {
		return this._black;
	}
	public void setBlack(boolean black) {
		this._black = black;
	}
	
	
	public int getX() {
		return _x;
	}
	public void setX(int x) {
		this._x = x;
	}
	
	public int getY() {
		return _y;
	}
	public void setY(int y) {
		this._y = y;
	}
	
	public int getValue() {
		return _value;
	}
	public void setValue(int value) {
		this._value = value;
	}
	
	public void moveCheck(int x, int y, figures obj) {
		
	}
	
	figures(){
		
	}
	
	figures(int x, int y){
		
	}
}
