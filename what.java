class Parent{
   public int i;
   protected int j;
}


class Child extends Parent{
   int i;
   void display(){
        super.i=30;
        super.j=35;
        System.out.println("In display--->value of i :"+i+" value of j:"+j);
    }
}

class Run{
    public static void main(String[] args){
     Child x=new Child();
        x.i=3;
        x.j=4;
        x.display();
        System.out.println("value of i :"+x.i+" value of j:"+x.j);
 
     }
}