class Employee
{
	int number;
	float salary;
	public int experience;
	int age;
	int height;
	
	void setNumber(int number)
	{
		this.number=number;
	}
	public void setSalary(float salary)
	{
		this.salary=salary;
	}
	public void setExperience(int experience)
	{
		this.experience=experience;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
    public int getNumber()
	{
		return this.number;
	}
	public float getSalary()
	{
		return salary;
	}
	public int getExperience()
	{
		return experience;
	}
	public int getAge()
	{
		return age;
	}
	public static void demoC()
	{
		System.out.println("inside demoC()");
	}
	public void demoB()
	{
		System.out.println("inside demoB()");
	}
	void demoA()
	{
		System.out.println("inside demoA()");
		demoB();
	}
	}
	public class Main{
	public static void main(String[] args)
	{
		int num;
		Employee e1;
		e1=new Employee();
		e1.number=101;
		e1.salary=20000;
		e1.experience=4;
		e1.age=34;
		e1.demoA();
		e1.demoB();
		e1.demoC();
		e1.setSalary(25000.0f);
		e1.setNumber(11);
		e1.setExperience(11);
		e1.setAge(34);
		System.out.println("e1 num "+e1.number);
		System.out.println("e1 salary "+e1.salary);
		System.out.println("e1 experience "+e1.experience
		);
	}
}
/*inside demoA()
inside demoB()
inside demoB()
inside demoC()
e1 num 11
e1 salary 25000.0
e1 experience 11
*/