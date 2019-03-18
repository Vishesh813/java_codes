import java.io.*;

class Main{
    public static void main(String[] args)  throws IOException  {
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        int n  =Integer.parseInt(br.readLine());
        new Solver().fibbo(n);
    }
}
class Solver{
   void fibbo(int n){
    int a=0;
    int b=1;
    int c=0;
      System.out.print(a+" ");
      System.out.print(b+" ");
    for(int i = 0; i < n; i++) {
        c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
   } 
}  
    
}