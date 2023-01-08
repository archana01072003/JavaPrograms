class Point
{
	private double x;
	private double y;
	Point()
	{
		x = 0;
		y = 0;
	}
	Point(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	void setX(double x)
	{
		this.x = x;
		this.y = y;
	}
	void setY(double y)
	{
		this.y = y;
	}
	void setValues(double x,double y)
	{
		this.x = x;
		this.y = y;
	}
	double getX()
	{
		return x;
	}
	double getY()
	{
		return y;
	}
	public void moveRight(int distance)
	{	x = x+distance;
	    y = y+distance;
	}
	public void moveLeft(int distance)
	{	x = x - distance;
	    y = y - distance;
	}
}
class Main4
{
	public static void main(String[] args)
	{
		
		Point p;
		p = new Point(1.2 ,3);
		p.moveLeft(1);
		System.out.println("After moving left the value of x is " +p.getX());
		System.out.println("After moving left the value of y is " +p.getY());
	}
}