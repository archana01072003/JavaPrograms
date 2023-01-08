class Student
{
	private int age;
	private float percentage;
	private int semester;

	public void setAge(int age)
	{
		this.age=age;
	}
	public void setPercentage(float percentage)
	{
		this.percentage=percentage;
	}
	public void setSemester(int semester)
	{
		this.semester=semester;
	}
	public int getAge()
	{
		return age;
	}
	public float getPercentage()
	{
		return percentage;
	}
	public int getSemester()
	{
		return semester;
	}
}

public class Main2
{

	public static void main(String[] args)
	{
		Student s1;
		s1 = new Student();
		s1.setAge(19);
		s1.setPercentage(90);
		s1.setSemester(5);
		System.out.println("s1 age : "+s1.getAge());
		System.out.println("s1 Percentage : "+s1.getPercentage());
		System.out.println("s1 Semester : "+s1.getSemester());
	}
}
