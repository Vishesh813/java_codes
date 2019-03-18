import java.util.*;

class Listexp{
    public static void main(String [] arg){
        List<String> ls =new ArrayList<>();
        ls.add("vishesh");
        ls.add("fuck");
        ls.add("123");
        String[] srr = new String[ls.size()];
        for(int i=0;i<ls.size();i++)  srr[i]=ls.get(i);
        Arrays.sort(srr);
          for(String s:srr)
        System.out.println(s);

    }
}