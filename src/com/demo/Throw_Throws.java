package com.demo;

public class Throw_Throws {
	
	
	public static void main(String[] args) throws MeenaException, GreensException {
		
		int i= 51;
		
		if (i<=18) {
			System.out.println("Allow");
			
		}
		
		
		throw new GreensException();
		
		
	}
	

}
