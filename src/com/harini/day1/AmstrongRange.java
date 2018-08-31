package com.harini.day1;

public class AmstrongRange {
	public static int[] findAllAmstrongNumbers(int start,int end) {
		int allArmstrongNumbers[] = new int[10];
        int rem,temp; 
        int sum;
        int index=0;
		for (int input = start ; input <= end ; input++) 
        { 
			 temp = input;
			 sum=0;
                   
                   while (temp != 0) 
                    { 
                                rem = temp % 10; 
                                sum = sum + (rem * rem * rem); 
                                temp = temp / 10; 
                    } 
                   if(sum == input)
       				allArmstrongNumbers[index++] = input;
               	
       		}
		for(int num:allArmstrongNumbers) {
		
			System.out.println(num);
		}
		return allArmstrongNumbers;
	}

}
