import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    static int sockMerchant(int n, int[] ar) {
       int temp,c=0;
/// logic of occurance checking////
       Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
       for(int i=0;i<n;i++){
          if(h.containsKey(ar[i])){
           temp=h.get(ar[i]);
           h.put(ar[i],++temp);
          }
          else h.put(ar[i],1);
       } 
        for(int key:h.keySet()){
            int temp2=h.get(key);
               c+=temp2/2;}
        return c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

