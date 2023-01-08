class Stack
{
	 private int size;
	 private int top = -1;
	 private int stack[];
	
	Stack()
	{
		this.size = 0;
	}
	Stack(int size)
	{
		this.size = size;
		this.stack = new int[size];
	}
	public void push(int num)
	{
		if(top == size-1)
		{
			System.out.println("Stack is Full");
		}
		else{
		top++;
		stack[top] = num;
		}
	}
	public int pop()
	{
		if(top == -1)
		{
			System.out.println("Stack is empty");
			return -1;
		}
		int temp = stack[top];
		top--;
		return temp;
	}
}
class Main5
{
	public static void main(String[] args)
	{
		Stack s = new Stack(5);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		System.out.println(s.pop());
	}
}
		