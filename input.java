/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
		//System.out.println("a is:"+str);
		String[] input = str.split("#");
		int a=Integer.parseInt(input[0]);
		double d=Double.parseDouble(input[1]);
		String s=input[2];
		
		
		System.out.println("a is:"+a);
		System.out.println("d is:"+d);
		System.out.println(" s is:"+s);
	}
}

