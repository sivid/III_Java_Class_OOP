package homework_3;

interface Shape {
	double computeArea(double radius);
	double computeCircumference(double radius);
}

class Circle implements Shape{
	double radius = 0;
	public double computeArea(double radius){
		return Math.PI * Math.pow(radius, 2);
	}
	public double computeCircumference(double radius){
		return Math.PI * radius * 2;
	}
}

class Rectangle implements Shape{
	double radius = 0;
	public double computeArea(double radius){
		return Math.pow(radius, 2);
	}
	public double computeCircumference(double radius){
		return radius * 4;
	}
}
