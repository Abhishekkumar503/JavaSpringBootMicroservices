package com.maven.maven.springboot;

public class Laptop implements Computer{
	
	@Override
	public void Compile()
	{
		System.out.println("Code Compiled in Laptop!");
	}

}
