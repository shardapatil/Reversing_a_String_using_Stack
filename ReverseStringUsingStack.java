package com.nm.reverseString;

import java.util.Scanner;

public class ReverseStringUsingStack {

	char stack[];
	int top;
	void stack(int size)
	{
		stack = new char[size];
		top = -1;
	}
	
	boolean isStackEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;
	}
	
	boolean isStackFull()
	{
		if(top == stack.length-1)
			return true;
		else
			return false;
	}
	
	Character push(char element)
	{
		if(isStackFull())
		{
			System.out.println("Stack is full");
			return null;
		}
		else
		{
			top++;
			stack[top] = element;
			return element;
		}
	}
	
	void print()
	{
		for(int i=top; i>=0;i--)
		{
			System.out.print(stack[i]);
		}
	}
	
	//extra code
//	 Character pop() {
//		 if(isStackEmpty())
//		 {
//			 System.out.println("stack is empty");
//			 return null;
//		 }
//		 else
//		 {
//			 char temp = stack[top];
//			 top--;
//			 return temp;
//		 }
//	 }
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ReverseStringUsingStack rev = new ReverseStringUsingStack();
		
		System.out.println("Enter a string : ");
		String str = sc.nextLine();
		
		char arr[] = str.toCharArray();
		
		rev.stack(arr.length);
		
		for(int i=0; i<=arr.length-1; i++)
		{
			rev.push(arr[i]);
		}
	
		System.out.println("String after reversing : ");
		rev.print();
	}
}
