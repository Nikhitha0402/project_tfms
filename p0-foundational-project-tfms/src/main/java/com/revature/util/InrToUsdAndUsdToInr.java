package com.revature.util;

import java.util.Scanner;

public class InrToUsdAndUsdToInr {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the rupees that you want to convert into dollars:");
		float rupees=scan.nextFloat();
		double dollars=rupees/81.77;
		System.out.println(dollars);
		System.out.println("Enter dollars that you want to convert into rupees");
		float dollar=scan.nextFloat();
		double rupee=dollar*81.77;
		System.out.println(rupee);
			}

		
	}


