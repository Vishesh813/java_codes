import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     public static void main(String arg[]){
   
  //Reading size;
//System.out.println("Enter the size");
 Scanner sc=new Scanner(System.in);
  int size=sc.nextInt();
  int[] num = new int[size];
 //Enterig the numbers; 
//System.out.println("Enter the no.s");   
 for(int i=0;i<size;i++) num[i]=sc.nextInt();
 result(num);
   
}
  public static int findReverse(int no){
     int temp=no,r,sum=0;
     while(temp>0){
      r=temp%10;
      sum=sum*10+r; temp=temp/10;
    }
    return sum;
 }
 
public static boolean numisPrime(int n){
        if(n==0||n==1){return false;}
        else{
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;} 
}

public static void result(int number[]){
    List<Integer> ls = new ArrayList<Integer>();
    for(int n:number){  
    if( numisPrime(n) && numisPrime(findReverse(n)) ) ls.add(n);}
    //System.out.println("results is");
    int[] temp = new int[ls.size()];
     for(int i=0;i<ls.size();i++) temp[i] = ls.get(i);
    Arrays.sort(temp);   
    for(int i:temp) System.out.println(i);
}
}


