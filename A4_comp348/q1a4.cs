class Rectangle : Shape {
	double side1, side2 = 0;
	public Rectangle(){
		side1 = 0;
		side2 = 0;
	}
	public Rectangle(double side1, double side2){
		this.side1 = side1;
		this.side2 = side2;
    }

	public double getPerimeter(){
		return (this.side1 + this.side2 + this.side1 + this.side2);
	}
	public double getArea(){
		return (this.side1 * this.side2);
	}
	String toString(){
		return "Name: " + this.getName() + ". Sides: " + this.side1 + ", " + this.side2;
	}
}
class Circle : Shape{
	double radius = 0;
	public Circle(){
		radius = 0;
	}
	public Circle(double radius){
		this.radius = radius;
	}
	public double getPerimeter(){
		return (2*this.radius*Math.PI); //d pi
	}
	public double getArea(){
		return (this.radius*this.radius*Math.PI); //r r pi
	}
	String toString(){
		return "Name: " + this.getName() + ". Radius: " + this.radius;
	}
}
interface Shape{
	public String getName(){
		return this.GetType().Name;//returns the type of object
    }
	public double getPerimeter();
	public double getArea();
}