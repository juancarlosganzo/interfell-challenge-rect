package mx.juancarlosganzo;

public class Rect {
	
	private Point ul;
	private Point lr;
	
	
	public Point getUl() {
		return ul;
	}



	public void setUl(Point ul) {
		this.ul = ul;
	}



	public Point getLr() {
		return lr;
	}



	public void setLr(Point lr) {
		this.lr = lr;
	}

	public Rect(Point ul, Point lr) {
		this.ul = ul;
		this.lr = lr;
	}
	
	public boolean isOverlap(Rect compare) {
		
		if(ul.getX() > compare.getLr().getX() || compare.getUl().getX() > lr.getX()) {
			return false;
		}
		if(ul.getY() < compare.getLr().getY() || compare.getUl().getY() <lr.getY()) {
			return false;
		}
		
		return true;
		
	}

}
