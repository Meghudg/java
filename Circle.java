package test3;

public class Circle {
	private float radius;
	float pi =(float)3.5;
	//constructor 1 default
	public Circle()
	{
		this.radius = 1.5f;
	}
	//constructor 2 overloaded with float argument
	Circle(float radius)
	{
		this.radius = radius;
	}
	//Constructor 3 overloaded with 2 arguments
	Circle(float radius,float pi)
	{
		this(radius);//invoking constructor 3 with this keyword
		this.pi =3.5f;
	}	
	
//calculating the area of circle
public float CalculateCircleArea(float radius)
{
	return pi*radius*radius;
}
public float Circumference(float radius)
{
	return 2*pi*radius;
}
public static void main(String[] args)
{
	Circle ref = new Circle();
	//calling the methods and printing the results
	float area = ref.CalculateCircleArea(ref.radius);
	System.out.println("area of circle is:" +area);
	float Circumference = ref.Circumference(ref.radius);
	System.out.println("Circumference of circle is:"+Circumference);
}
}





	

	
