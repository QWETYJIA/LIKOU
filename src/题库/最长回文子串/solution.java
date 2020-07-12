package 题库.最长回文子串;

import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s1=input.next();
		String s=longestPalindrome(s1);
		System.out.println(s);
	}
	public static String longestPalindrome(String s) {
		
		int left=0;//选中i的左边
		int right=0;//选中i的右边
		int len=1;//回文字串的长度
		int maxLen=0;//最大的长度
		int start=0;//最大长度对应的字符串最大
		for(int i=0;i<s.length();i++) {
			left=i-1;
			right=i+1;
			while(left>=0&&s.charAt(left)==s.charAt(i)) {
				len++;
				left--;
				
			}
			while(right<s.length()&&s.charAt(right)==s.charAt(i)) {
				len++;			
				right++;
				
			}
			 while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
	                len = len + 2;
	                left--;
	                right++;
	            }

			if(len>maxLen) {
				maxLen=len;
				start=left;
			}
			len=1;
		}	
		//不+1的话会发生越界问题
		return s.substring(start+1, start+maxLen+1);

	}
}
