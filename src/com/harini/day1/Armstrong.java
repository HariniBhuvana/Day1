package com.harini.day1;

import java.util.Scanner;

public class Armstrong {
	public static boolean armstrongCheck(int i) {
		int number = i,total = 0,temp;
		while (number != 0) {
			temp = number % 10;
			total = total + temp * temp * temp;
			number /= 10;
		}

		if (total == i)
		{	System.out.println(i + " is an Armstrong number");
		return true;
		}
		else
			{System.out.println(i + " is not an Armstrong number");
			return false;
			}
		}
}
