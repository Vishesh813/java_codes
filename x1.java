/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class x
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
		
        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i]=str.charAt(i);
        }

        Arrays.sort(ch);
        for (int i = 0; i < str.length(); i++) {
            System.out.print((int)ch[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            System.out.print(ch[i]+" ");
        }
		//System.out.println("a is:"+ch[str.length()-2]);
		// System.out.println("d is:"+d);
		// System.out.println(" s is:"+s);
	}
}

