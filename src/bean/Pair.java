package bean;

public class Pair {
	private int x;
	private int y;
	
	public Pair(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void incrementX(){
		x++;
	}
	
	public void incrementY(){
		y++;
	}
	
	public Pair(){
		x = 0;
		y = 0;
	}
	
	public String toString(){
		return "x:" + x + ", y:" + y; 
	}
	
	
	public class PairValuesNotEqualException extends RuntimeException{
		public PairValuesNotEqualException(){
			super("Pair value is not equal:" + Pair.this);
		}
	}
	
	public void checkStatus(){
		if(x!=y){
			throw new PairValuesNotEqualException();
		}
	}
}
