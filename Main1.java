class Employee
{
private int number;
private float salary;
private int experience;
private int age;
public void setNumber(int number)
{
this.number = number;
}

public void setSalary(float salary)
{
this.salary = salary;
}

public void setExperience(int experience)
{
this.experience = experience;
}

public void setAge(int age)
{
this.age = age;
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

public Employee getHigherExperienced(Employee e)
{
if(this.experience  > e.experience)
{
return this;
}
else
{
return e;
}
}
}
public class Main1
{

public static void main(String[] args)
{
int num;
Employee e1;
e1 = new Employee();
e1.setNumber(11);
e1.setSalary(25000.0f);
e1.setExperience(11);
e1.setAge(34);

Employee e2;
e2 = new Employee();
e2.setNumber(15);
e2.setSalary(20000.0f);
e2.setExperience(8);
e2.setAge(31);
num = e1.getNumber();
Employee e3 = e1.getHigherExperienced(e2);
System.out.println("Experience of higher experienced professional is "+e3.getExperience());
System.out.println("Employee e1 number:"+e1.getNumber());
System.out.println("Employee e1 salary:"+e1.getSalary());
System.out.println("Employee e1 experience:"+e1.getExperience());

}
}


/*
Experience of higher experienced professional is 11
Employee e1 number:11
Employee e1 salary:25000.0
Employee e1 experience:11
*/