package com.java.test;

import java.util.Scanner; 

public class Rectangle {
	public static void main(String[] args) {

			float l, b;
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter the value of l:");
			l=scan.nextInt();
			
			System.out.println("Enter the value of b:");
			b=scan.nextInt();
			
			double area=l*b;
			double perimeter= 2*(l+b);
			
			System.out.println("Area="+ area);
			System.out.println("Perimeter="+perimeter);
		}

	

	}

