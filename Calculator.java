package com.epsilon.training.sbcalculator.beans;

import org.springframework.stereotype.Component;

@Component
public class Calculator {
	private int in1;
	private int in2;
	
	public Calculator()
	{
		System.out.println("calculator instance is getting created");
	}
	public int addition(int i,int j)
	{
		return i+j;
	}
	public int subtract(int i,int j)
	{
		return i-j;
	}
	public int multiplication(int i,int j)
	{
		return i*j;
	}
	public int division(int i,int j)
	{
		return i/j;
	}
	public int modulo(int i,int j)
	{
		return i%j;
	}
	public int getIn1() {
		return in1;
	}
	public void setIn1(int in1) {
		this.in1 = in1;
	}
	public int getIn2() {
		return in2;
	}
	public void setIn2(int in2) {
		this.in2 = in2;
	}
	

}
