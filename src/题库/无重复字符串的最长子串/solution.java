package 题库.无重复字符串的最长子串;

import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.next();
		int i = lengthOfLongestSubstring(s1);
		System.out.print(i);
	}
	  
		public static int lengthOfLongestSubstring(String s) {   
			int max = 0; //最长串长度    
			int start = 0; //当前不重复串起始位置     
			for(int i=0;i<s.length();i++){        
				       
				for(int j = start ;j<i; j++){    
					if(s.charAt(j) == s.charAt(i)){
						//发现一个与i位置相同的字母，则将不重复串位置移到这个字母后面，并终止循环   
						start = j + 1;                
						        
						break;            
						}    } 
				max = Math.max(i-start+1,max);//更新最长不重复串值。
				}      
			return max;   
	}
						
	
}
