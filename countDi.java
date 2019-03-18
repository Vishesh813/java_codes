
import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
        InputStreamReader input= new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);

        int size=Integer.parseInt(br.readLine());
        int[] arr1=new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=Integer.parseInt(br.readLine());
        }
        int[] arr2=new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i]=Integer.parseInt(br.readLine());
        }
        System.out.println(solve(arr1,arr2));
    }

    static int solve(int[] a1,int[] a2 ){
       int c=0;
        for (int i = 0; i < a1.length; i++) {
             for (int j = 0; j< a2.length; j++) {
                 if(a1[i]==a2[j]){ 
                     c++;
                 }
             }
         }
         return  a1.length+ a2.length-2*c;
    }
}