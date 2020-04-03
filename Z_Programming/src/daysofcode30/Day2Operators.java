package daysofcode30;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day2Operators {

	
	// Complete the solve function below.
	static void solve(double meal_cost, int tip_percent, int tax_percent) {

	
		
		
		double tipCalc = meal_cost * tip_percent/100;
		double taxCalc = meal_cost * tax_percent / 100;
		int totalCost = (int) Math.round(meal_cost + tipCalc +taxCalc);
		System.out.println(totalCost);
		
		}

	public static void main(String[] args) {
		
//		Day2 meal = new Day2();
		Day2Operators.solve(10.25, 17, 5);

	}
}
