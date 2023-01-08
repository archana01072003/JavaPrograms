class Student
{
	private int age;
	private int rollNo;
	private String firstName;
	private String lastName;
	Student()
	{
	}
	Student(int rollNo)
	{
		this.rollNo = rollNo;
	}
	Student(int rollNo,String firstName)
	{
		this.rollNo = rollNo;
		this.firstName = firstName;
	}
	Student(int rollNo,String firstName,String lastName)
	{
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	void setAge(int age)
	{
		this.age = age;
	}
	void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
	void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	int getAge( )
	{
		return age;
	}
	int getRollNo()
	{
		return rollNo;
	}
	String getFirstName()
	{
		return firstName;
	}
	String getLastName()
	{
		return lastName;
	}
}
class Main3
{
	public static void main(String[] args)
	{
		Student s1;
		s1 = new Student(33,"Ram");
		s1.setLastName("sharma");
		s1.setAge(20);
		System.out.println("Age : "+s1.getAge());
		System.out.println("Roll No : "+s1.getRollNo());
		System.out.println("First Name : "+s1.getFirstName());
		System.out.println("Last Name : "+s1.getLastName());
	}
}