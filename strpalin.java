import java.io.*;

class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Solver x= new Solver();
        System.out.println( x.checkPalindrome(str));

    }
}

class Solver{
    private String st="";
    boolean checkPalindrome(String s){
        for (int i = s.length()-1; i >=0; i--) {
            st+=s.charAt(i);
        }
       if(st.equals(s)) return true;
       else return false;
    }
}