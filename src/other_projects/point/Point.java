/*
* Anthony Mui
* Period 2
* Point Class
* A class called point with test class
* */
package other_projects.point;
import java.lang.Math;

public class Point {
    private double x;
    private double y;
    public Point(){
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void translate(double height, double width){
        this.x += width;
        this.y += height;
    }
    public void translateTo(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double slope(Point other){
        return (this.y-other.y)/(this.x-other.x);
    }
    public double distance(Point other){
        return Math.sqrt(Math.pow(this.y-other.y,2)+Math.pow(this.x-other.x,2));
    }
    public double distanceFromOrigin(){
        return this.distance(new Point(0,0));
    }
    public Point midpoint(Point other){
        return new Point((this.x+other.x)/2,(this.y+other.y)/2);
    }
    public double getX(){
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public String toString() {
        return "Point(" + x + ", " + y + ')';
    }
}

class PointTester{
    public static void main(String[] args) {
        Point p1 = new Point(4,4);
        System.out.println(p1.slope(new Point(0,0)));
        System.out.println((p1.distance(new Point(0,4))));
        System.out.println((p1.distanceFromOrigin()));
        System.out.println(p1.midpoint(new Point(0,0)));
        System.out.printf("%f, %f %n",p1.getX(), p1.getY());
        System.out.println(p1.toString());
    }
}
