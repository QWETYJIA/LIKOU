package ���.���ظ��ַ�������Ӵ�;

import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.next();
		int i = lengthOfLongestSubstring(s1);
		System.out.print(i);
	}
	  
		public static int lengthOfLongestSubstring(String s) {   
			int max = 0; //�������    
			int start = 0; //��ǰ���ظ�����ʼλ��     
			for(int i=0;i<s.length();i++){        
				       
				for(int j = start ;j<i; j++){    
					if(s.charAt(j) == s.charAt(i)){
						//����һ����iλ����ͬ����ĸ���򽫲��ظ���λ���Ƶ������ĸ���棬����ֹѭ��   
						start = j + 1;                
						        
						break;            
						}    } 
				max = Math.max(i-start+1,max);//��������ظ���ֵ��
				}      
			return max;   
	}
						
	
}
