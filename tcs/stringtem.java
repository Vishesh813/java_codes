import java.io.*;
import java.util.*;

class Compare{
    public static void main(String [] args){
        String s="abcd";
        String p="abce";
        String max="";
        int i=p.compareTo(s);
        if (i>0) {
            max=p;
        }
        System.out.println(max);
    }
}