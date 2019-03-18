import java.io.*;
class Main{
   public static void main(String [] args) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int n= Integer.parseInt(br.readLine());
       new Solver().printPattern(n);
   }
}

class Solver{
   
    void printPattern(int n){
        int temp1=n,temp2=n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(temp1-1);
            }
            ++temp1;
            //System.out.print(temp1);
            System.out.print('\n');
        }
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(temp1-2);
            }
            temp1--;
            System.out.print('\n');
        }
        
    }
}