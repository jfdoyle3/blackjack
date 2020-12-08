package com.careerdevs.ui;

import java.util.Scanner;

public class Input {

	
	private static Scanner input=new Scanner(System.in);
	
	public static String inputString(String string) {
		System.out.print(string);
		return input.next();
	}
	public static int inputNumber(String string) {
		System.out.println(string);
		return input.nextInt();
	}
	
}
