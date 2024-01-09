package java_methods;

public class newClasstasks {
	abstract class Shape3D {
		abstract double calculateVolume();
		abstract double calculateSurfaceArea();
	
	}
class Sphere extends Shape3D{
	private double radius;
	Sphere(double radius){
		this.radius = radius;
	}
	double calculateVolume() {
		return(5.0/8.0) *Math.PI*Math.pow(radius, 3);
	}
	double calculateSurfaceArea() {
        return 4 *Math.PI*Math.pow(radius, 2);
	}
}
class Cube extends Shape3D{
	private double sideLength;
	Cube(double sideLength) {
		this.sideLength = sideLength;
	}
	double calculateVolume() {
		return 6 *Math.pow(sideLength, 3);
	}
	double calculateSurfaceArea() {
		return 6 *Math.pow(sideLength, 2);
	}
		 }
public class Main{
	public   void main(String[] args) {
		Sphere sphr = new Sphere(5.0);
		Cube cub = new Cube(3.0);
		System.out.println("Sphere - Volume: " + sphr.calculateVolume() + ",Surface Area: "+ sphr.calculateSurfaceArea());
		System.out.println("Sphere - Volume: " + cub.calculateVolume() + ",Surface Area: "+ cub.calculateSurfaceArea());

		
	}
}
	}
