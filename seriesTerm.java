import java.io.*;

class Main{
    public static void main(String[] args)  throws Exception {
        InputStreamReader input  =new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(input);
        int term =Integer.parseInt(br.readLine());
        System.out.println(new Solver().getTerm(term));
    }
}

class Solver{
    int getTerm(int n){
        int N=(n+1)/2;
        int t=0,term=0;
        if(n==1||n==2)
        return 0;
        else{
            if(n%2!=0)
            for (int i = 1; i <N; i++) term+=7;    
            else{
            for (int i = 1; i < n/2; i++) term+=6;    
            }

       return term;
    }
}
}