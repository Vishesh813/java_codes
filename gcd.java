import java.io.*;

class gcd{
    public static void main(String[] args) throws IOException {
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(input);
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        System.out.println(gcdOf(n1,n2));
    }
    static int gcdOf(int a,int b){
        int max= a>b?a:b;
        int GCD=0;
        for (int i = max; i >0; i--) {
            if(a%i==0 && b%i==0){
             GCD=i;
             break;
            }
        }
        return GCD;
        
    }
}