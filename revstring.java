class Main{
    public static void main(String[] args) {
        String s ="12345";
        s=s.concat("6789");
        String s1="";
        for (int i = s.length()-1; i >=0 ; --i) {
            s1 = s1+s.charAt(i);
        }
        StringBuffer s3= new StringBuffer("Hello World");
        StringBuilder s4=new StringBuilder("Programmer");
        s4.reverse();
        s3.reverse();
        s3.toString();

        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s4);
    }
}