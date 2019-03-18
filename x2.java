import java.io.*;
import java.util.*;

  class A {
  
    public static void main(String args[]) throws IOException {
    int id;
    String file;
    String title;
    int page;
       
         
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       
        Document[] d = new Document[3];
                     
        for (int i = 0; i < d.length; i++) {
            id = Integer.parseInt(br.readLine());
            title = br.readLine();
            //System.out.println("title is "+title);
            
            file =  br.readLine();
           // System.out.println("file is "+file);
            page =Integer.parseInt(br.readLine());
           
            d[i] = new Document(id, title,file,page);
            
        }
             new Solve().solve(d);      
    }
}
  
class Solve {
    int id1=0;
    String file1="";
    String title1="";
    int page1=0;

    Document solve(Document[] d){
        for (int i = 0; i < d.length; i++) {
           
           
            file1+=d[i].file+"@";
            title1+=d[i].title+"#";
            page1=page1+d[i].page;
        }
        id1 =d[d.length-1].id+1;
        file1=file1.substring(0,file1.length()-1);
        title1=title1.substring(0,title1.length()-1);;

          Document s=new Document(id1,file1,title1,page1);
          System.out.println("output in solve method");
          System.out.println(s.id);
          System.out.println(s.title);
          System.out.println(s.file);
          System.out.println(s.page);


        return s;
    }
   

}

class Document{
    int id;
    String file;
    String title;
    int page;

    Document(int id, String title, String file, int page) {
        this.id = id;
        this.title = title;
        this.file = file;
        this.page = page;
    }
}