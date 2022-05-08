import java.util.*;
/*
Program to take in user input of 
sides of a triangel and calculate the type of
of triangle. 
Author: Zoe Arnold 
*/


public class TriangleTest
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		double side1;
		double side2;
		double side3;

		System.out.println("This program calculates the type of a triangle.");
		System.out.print("Enter the length of the first side. ");
		side1 = keyboard.nextDouble();
		System.out.print("Enter the length of the second side. ");
		side2 = keyboard.nextDouble();
		System.out.print("Enter the length of the third side. ");
		side3 = keyboard.nextDouble();
		
		if ((side1 < side2 + side3) && (side2 < side1 + side3) && (side3 < side1 + side2)) {
			System.out.println("This is a valid triangle."); 
				
				if ((side1 == side2) && (side2 == side3) && (side3 == side1)) 
				System.out.println("This is an equilateral triangle.");	
				
				else if ((side1 == side2) || (side2 == side3) || (side1 == side3)) 
				System.out.println("This is an isosceles triangle.");	
				
				else if ((side1 != side2) && (side2 != side3) && (side1 != side3))
				System.out.println("This is a scalene triangle."); 
		}	
				
		else 
			System.out.println("These numbers don't form a valid triangle. Try different numbers."); 
	
			
	}			
	}

	
	
		
	
		
		
