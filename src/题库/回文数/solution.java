package 题库.回文数;

import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int s1=input.nextInt();
		boolean s=isPalindrome(s1);
		System.out.println(s);
	}
	public static boolean isPalindrome(int x) {
		 if(x < 0)
	            return false;
	        int nums = 0;
	        int num = x;
	        while(num != 0) {
	            nums = nums * 10 + num % 10;
	            num=num/10;
	        }
	        return nums == x;
	    }

	
}
