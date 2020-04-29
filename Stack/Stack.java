package co.java.Stack;

public class Stack {
	
	//Push method,But before using push method first need to create the array
	
	int stack[] = new int[5];
	int top=0;
	public void push(int data)
	{
		stack[top] = data;
		top++;
	//Now since we have added both 15 & 8 it will go to 0th location,But we want 15-0,8-1
	// Use a counter top which will count and after insertion do top++,now 15-0 & 8-1
	}
	
	public int pop()
	{
		int data;
		top--;
		data  = stack[top];// Here top decides which data to be fetched as we have already declared that
		stack[top]=0; // New value insertion
		return data;
	}
	
	public void show()  //to print the values
	{
		for(int n : stack)
		{
			System.out.println(n+ "");
		}
	}
}
