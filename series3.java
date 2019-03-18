import java.io.*;
 class Main{
     public static void main(String[] args) {
         try {
            InputStreamReader input= new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(input);
            int term = Integer.parseInt(br.readLine());
            Solver x= new Solver();
            x.result(term);                       
         } catch (Exception e) {
             //TODO: handle exception
         }
     }
 }


 class Solver{
     void result(int n){
        for (int i = 1; i <=n; i++) {
            if(i%2!=0) series1(i);
            else series2(i);

        }  

     }

     void series1(int n){
         int N=(n+1)/2,t=0;
         if(N==1)
         System.out.print(0+" ");
         else{
         for (int i = 1; i < N; i++)  t+=2;
         System.out.print(t+" ");
        }
     }

     void series2(int n){
        int N=n/2,t=0;
        if(n==2)
        System.out.print(0+" ");
        else{
        for (int i = 1; i < N; i++)  t+=1;
        System.out.print(t+" ");
       }
    }
 }