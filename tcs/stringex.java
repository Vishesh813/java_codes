import java.io.*;
import java.util.*;

class Demo{
    public static void main(String [] args){
        String temp="";
        String [] strarr={"vishesh","pihu","priyanka","randi","ramesh","raka"};
        for(int i=0;i<strarr.length;i++){
            for(int j=i+1;j<strarr.length;j++){
                if(strarr[i].compareTo(strarr[j])>0){
                  temp=strarr[i];
                  strarr[i]=strarr[j];
                  strarr[j]=temp;
                }
            }
        }

        // for( String var : strarr) {
        //     System.out.println(var);
        // }
       // Arrays.sort(strarr);
        System.out.println(Arrays.toString(strarr));
    }
}