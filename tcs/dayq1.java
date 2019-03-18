import java.io.*;

class Solution{
    public static void main(String arg[]) throws IOException{
        char[] strToarray=null;
        char max,min; 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String str=br.readLine();
         strToarray=str.toCharArray();
         min=max=strToarray[0];
         for(int i=1;i<strToarray.length;i++){
             if(max<strToarray[i]) max=strToarray[i];
         }
         for(int i=1;i<strToarray.length;i++){
            if(min>strToarray[i]) min=strToarray[i];
        }

         System.out.println(max);
         System.out.println(min);

    }
}