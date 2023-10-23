package tp41;

public class Point {
	protected double x ;
	protected double y ;
	
	Point(){
		this.x=0 ;
		this.y=0 ;
	}
	
	Point(double a, double b){
		this.x=a;
		this.y=b;
	}
	void affiche() {
		System.out.println(" x= "+this.x+" y= "+this.y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
