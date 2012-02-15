package com.opg1;

import java.util.Random;

public class Opgave1 {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		int max = 0;
		int min = 100; //Maximale Waarde
		
		Random r = new Random();
		for(int i = 0; i < 20000; i++) {
			int j = r.nextInt(101);
			if(j > max)
				max = j;
			if(j < min)
				min = j;
			sum += j;
		}
		
		System.out.println("Som: " + sum);
		System.out.println("Gemiddelde: " + ((double)sum/(double)20000));
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);

	}

}