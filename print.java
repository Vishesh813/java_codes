import java.io.*;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String inputstr= br.readLine();
        String[]  input = inputstr.split(" ");
        int r1=Integer.parseInt(input[0]);
        int r2=Integer.parseInt(input[1]);
        new Solver().printPrime(r1,r2);
        //System.out.println(r1+r2); 
    }
}
class Solver{
      void printPrime(int a,int b){
          for (int i = a; i <=b; i++) {
              if(isPrime(i))
              System.out.println(i);
          }
      }

      boolean isPrime(int n){
          boolean flag=true;
          if(n==0||n==1) flag=false;
          else{
              for (int i = 2; i < n; i++) {
                  if(n%i==0) flag= false;
              }
          }
       return flag;
        }
}