package com.demo;

import java.util.Scanner;

public class A {
	
	    public static void main(String[] args) {
	        int n = 5;
	        int[][] triangle = new int[n][2*n-1];
	        
	        // Populate the triangle with powers of 2
	        for (int i = 0; i < n; i++) {
	            for (int j = n-i-1; j < 2*i+n; j+=2) {
	                triangle[i][j] = (int) Math.pow(2, i);
	            }
	        }
	        
	        // Print the triangle
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < 2*n-1; j++) {
	                if (triangle[i][j] == 0) {
	                    System.out.print(" ");
	                } else {
	                    System.out.print(triangle[i][j]);
	                }
	            }
	            System.out.println();
	        }
	    }
	}






























//	public void name() {
//System.out.println("Meena");
//	
//	}
//	
//	public static void main(String[] args) {
//		
//		
//	
//	
//}
// 
//
//1015 8 49 25 98 32
//
//
//
//
//
//
////		 String input = "Java Testing";
////	        String output = "";
////
////	        for (int i = 0; i < input.length(); i++) {
////	            char c = input.charAt(i);
////	            output += c;
////	            for (int j = 0; j < i; j++) {
////	                output += "*";
////	            }
////	            output += " ";
////	        }
////
////	        System.out.println(output);
////	    }
////	}
//	
//	
