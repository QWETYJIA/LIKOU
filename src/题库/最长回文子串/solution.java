package ���.������Ӵ�;

import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String s1=input.next();
		String s=longestPalindrome(s1);
		System.out.println(s);
	}
	public static String longestPalindrome(String s) {
		
		int left=0;//ѡ��i�����
		int right=0;//ѡ��i���ұ�
		int len=1;//�����ִ��ĳ���
		int maxLen=0;//���ĳ���
		int start=0;//��󳤶ȶ�Ӧ���ַ������
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
		//��+1�Ļ��ᷢ��Խ������
		return s.substring(start+1, start+maxLen+1);

	}
}
