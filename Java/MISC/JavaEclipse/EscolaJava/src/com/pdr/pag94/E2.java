package com.pdr.pag94;

import java.util.Scanner;

public class E2 {
	
	static Scanner sc = new Scanner(System.in);
	public static float s;
	
	
		public static void main(String[] args) {
			
			System.out.print("Salario: ");
			s = sc.nextInt();
			
			float sm = 450;
			sm = s / sm;
			System.out.printf("Voce ganha "+ sm +" salarios minimos");
			
		}
}
