package Ìâ¿â.Z×ÖÐÎ±ä»»;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
	//	Scanner input=new Scanner(System.in);
		int s1=3;
		String s="LEETCODEISHIRING";
		String str=convert(s,s1);
		System.out.println(str);
	}
	public static String convert(String s,int numRows) {
		int flag=-1,i=0;
		List<StringBuilder> str=new ArrayList<>();
		  for(int k = 0; k <numRows; k++)
			  str.add(new StringBuilder());
		for(char a:s.toCharArray()) {
			str.get(i).append(a);
			if(i==0||i == numRows -1)
			flag=-flag;
			i=i+flag;
			}
		StringBuilder res = new StringBuilder();
        for(StringBuilder row : str) res.append(row);
        return str.toString();

	
		
	}
	

}
