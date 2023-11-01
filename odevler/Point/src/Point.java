
import java.lang.*;
public class Point {
	
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void distance() {
		double distance = Math.sqrt(((x*x )+(y*y)));
		System.out.println("noktanın merkeze uzaklığı : " + distance);
	}
	
	public void distanceObject(Point point) {
		int objectX = point.x - this.x;
		int objectY = point.y - this.y;
		
		double distanceObject = Math.sqrt(Math.pow(objectX, 2) + Math.pow(objectY, 2));
	}
	
	public Point clone(){
		
		Point point = new Point(this.x, this.y);
		return point;
		
	}	
	
	public void move(int x, int y) {
		this.x +=x;
		this.y =y;
	}
	
	
	

}
