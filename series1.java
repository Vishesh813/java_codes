import java.io.*;
class Main{
    public static void main(String[] args)  throws Exception {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int term =Integer.parseInt(br.readLine());
        new Solver().seriesPrinter(term);
    }
}
class Solver{
    void seriesPrinter(int n){
        for (int i = 1; i <= n; i++) {
            if (i%2!=0) {
                series1(i);
            }
            else{
                series2(i);
            }
        }
     
    }
    void series1(int n){
        int t=1;
        if(n==1)
        System.out.print(t + " ");
        else{
        for (int i = 1; i < ((n+1)/2); i++) t*=2;
        System.out.print(t + " ");}
    }
    void series2(int n){
        int t=1;
        if(n==2)
        System.out.print(t + " ");
        else{
        for (int i = 1; i < n/2; i++) t*=3;
        System.out.print(t + " ");}
    }
}