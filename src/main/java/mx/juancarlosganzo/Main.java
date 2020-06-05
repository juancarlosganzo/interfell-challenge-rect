package mx.juancarlosganzo;

public class Main {

	public static void main(String[] args) {

		
		Rect rect1 = new Rect(new Point(0, 10), new Point(10, 0));
		Rect rect2 = new Rect(new Point(5, 5), new Point(15, 0));
		if(rect1.isOverlap(rect2)) {
			 System.out.println("Overlap");
		}else {
			System.out.println("Don't Overlap"); 
		}
		
		

	}

}
