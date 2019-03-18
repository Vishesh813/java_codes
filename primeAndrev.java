import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {
        
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        int testcase =Integer.parseInt(br.readLine());
        int[] arr =new int[testcase];
        for (int i = 0; i < testcase; i++) {
            arr[i]=Integer.parseInt(br.readLine());
        }
        Solver x = new Solver();
        x.solve(arr);
       
    }    
}
class Solver{
    boolean isPrime(int n){
        boolean flag=true;
        if(n==0||n==1)
        flag=false;
        else{
            for (int i = 2; i < n; i++) {
                if(n%i==0){
                    flag=false;
                    break;
                }
            }
            
        }
        return flag;
    }

    boolean isReverseIsPrime(int n){
        int temp=n,sum=0,r;
        while (n>0) {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return isPrime(sum);
    }

    void solve(int[] n){
        List<Integer> ls= new ArrayList<>();
        for (int i : n) {
            if(isPrime(i) && isReverseIsPrime(i)){
                  ls.add(i);
            }
        }
        int[] array = new int[ls.size()];
        for (int i = 0; i < ls.size(); i++) array[i]=ls.get(i);
        Arrays.sort(array); 
       
        System.out.println("After solving:");
        for ( int i : array) {
            System.out.println(i);
        }
    }
}