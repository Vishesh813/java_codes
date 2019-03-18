import java.io.*;
class Student{
    private String name,school;
    private int id, rank;

    Student(int id,String n,int r,String s){
        this.id=id;
        this.school=s;
        this.name=n;
        this.rank=r;
    }

    String getName(){
        return name;
    }
    int getRank(){
        return rank;
    }
    String getSchool(){
        return school;
    }
    int getId(){
        return id;
    }

}

class Solution{
    public static void main(String [] arg) throws IOException{
        int size, id,r;
        String n,s;
        Student[] student=null;  
    
        InputStreamReader input=new InputStreamReader(System.in);
          BufferedReader br=new BufferedReader(input);

          size=Integer.parseInt(br.readLine());
          student=new Student[size];
          for (int i = 0; i < size; i++) {
              id=Integer.parseInt(br.readLine());
              n=br.readLine();
              s=br.readLine();
              r=Integer.parseInt(br.readLine());
              student[i]=new Student(id,n,r,s);
          }
            
          for(Student stu:new Solver().sort(student)) System.out.println(stu.getId()+" "+stu.getName()+" "+stu.getSchool()+" "+stu.getRank());
    }
}

class Solver{
    Student[] sort(Student[] st){
        Student s=null;
        for(int i=0;i<st.length;i++){
            for(int j=i+1;j<st.length;j++){
                if(st[i].getRank()>st[j].getRank()){
                    s=st[i];
                    st[i]=st[j];
                    st[j]=s;
                }
            }
        }
        return st;
    }
}