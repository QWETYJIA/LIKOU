package 题库.整数反转;

import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int s1=input.nextInt();
		int x=reverse(s1);
		System.out.println(x);
	}
	public static int reverse(int x) {
		int num=0;
		int re=0;
		long res=0	;
		while (x!=0) {
			num=x%10;
			if(res>214748364||res==214748364&&x>=7) {
			
				return 0;
			}	
			if(res<-214748364||res==-214748364&&x<-7) {
				
				return 0;
			}	
			x=x/10;
			res=res*10+num;
			
		}
		re=(int) res;
		return re;
		
	}   

}
