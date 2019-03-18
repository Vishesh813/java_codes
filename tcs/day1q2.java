import java.io.*;
class Document{
   private String title,folder;
   private int id,page;
    Document(int id,String title,String folder,int page){
       this.id=id;
       this.title=title;
       this.page=page;
       this.folder=folder;
    }
    
     String getTitle(){
         return title;
     }
     String getfolder(){
        return folder;
    }
    int getId(){
        return id;
    }
    int getPage(){
        return page;
    }
}

class Solution{

    public static void main(String [] arg) throws IOException {
        String t,f;
        int p,id,size;
        InputStreamReader input=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(input);
        size=Integer.parseInt(br.readLine());
        Document[] docs =new Document[size];

         for(int i=0;i<docs.length;i++){
            id=Integer.parseInt(br.readLine());
            t=br.readLine();
            f=br.readLine();
            p=Integer.parseInt(br.readLine());
            docs[i]=new Document(id,t,f,p);
         }

         Document d=new Solver().solve(docs);
         System.out.println(d.getId());
         System.out.println(d.getTitle());
         System.out.println(d.getfolder());
         System.out.println(d.getPage());
    }
}

class Solver{
    Document solve(Document[] docs){
       int p=0,max=docs[0].getId();
       String t="";
       String f="";
          
         for(Document d:docs) if(max<d.getId()) max=d.getId();

       for(Document d: docs){
           t+=d.getTitle()+"@";
           f+=d.getfolder()+"#";
           p+=d.getPage();
       }
        t=t.substring(0,t.length()-1);
        f=f.substring(0,f.length()-1);
        Document x=new Document(max,t,f,p);
         return x;
    }
}