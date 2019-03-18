import java.io.*;

class Main{
    public static void main(String[] args) throws IOException {
            //BufferedReader br =new BufferedReader(new InputStreamReader(Sytem.in));
            String x1="Tony";
            StringBuffer buffer = new StringBuffer(x1);
            String buffertostring=new String(buffer);
            buffer.setCharAt(0,'S');
            System.out.println(buffer);

            StringBuilder builder= new StringBuilder("Stark");
            System.out.println(builder.charAt(0));
            //System.out.println(buffertostring.reverse());

        }
    
}