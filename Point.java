import java.util.*;
public class Point {
	int x,y;
	static int count=0;

	public Point(){
		this.x=0;
		this.y=0;
		count++;
	}

    public Point(int x,int y) {
    	this.x=x;
    	this.y=y;
    	count++;
    }
    public static Point add(Point p1,Point p2){
      return new Point(p1.x+p2.x,p1.y+p2.y);
    }
    public void add(Point p){
    	this.x+=p.x;
    	this.y+=p.y;
    }
    @Override
    	public String toString(){
    		return"X is: "+x+" "+"Y is: "+y;
    	}

    public int getX(){
    	return x;
    }
    public int getY(){
    	return y;
    }

    public static void main(String[] args) {
    	Point p1 = new Point();
    	Point p2 = new Point();
    	Point p3 = new Point(5,10);
    	Point p4 = new Point(5,10);
    	Point p5 = Point.add(p3,p4);
    	/*
    	System.out.println("p1: " + p1);
    	p1.add(p3);

    	System.out.println("p1: " + p1);
    	System.out.println("p2: " + p2);
    	System.out.println("p3: " + p3);
    	System.out.println("p4: " + p4);
    	System.out.println("p5: " + p5);
    	System.out.println(count);
		*/
    	Triangle t1= new Triangle();
    	Triangle t2= new Triangle(p2,p3,p5);
    	System.out.println(t1);
    	System.out.println(t2);
    	System.out.println(t2.copy());
    	System.out.println("Triangles Made are: "+Triangle.count2);


    }
}
  class Triangle{
  	Point p1,p2,p3;
  	public static int count2;

  public Triangle(){
  	p1= new Point();
  	p2=new Point();
  	p3=new Point();
  	count2++;
  }
  public Triangle(Point p1,Point p2,Point p3){
  	this.p1=p1;
  	this.p2=p2;
  	this.p3=p3;
    count2++;

}
 public Triangle copy(){
  	return new Triangle(p1,p2,p3);

  }
  public void rotate() {
    Point temp = p1;

    p1 = p2;
    p2 = p3;
    p3 = temp;
}
@Override
public String toString() {
    return "Triangle:\n" +
           "p1: " + p1 + "\n" +
           "p2: " + p2 + "\n" +
           "p3: " + p3;
}

  }
