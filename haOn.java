import java.util.*;

class MailBoxDemo {
    public static void main(String args[]){
    MailBox mailbox1= new MailBox(7,"vjcmlwe","szfolwb");
    MailBox mailbox2= new MailBox(67,"imcftaw","jlnzywo");
    MailBox mailbox3= new MailBox(26,"lsckexs","lyqonys");
    MailBox mailbox4= new MailBox(5,"cbajxhj","rgwyxze");
    MailBox mailbox5= new MailBox(4,"bxifplc","wevsaco");
    
    
    MailBox[] objArray= {mailbox1,mailbox2,mailbox3,mailbox4,mailbox5};
    
    MailBox[] objResultArray1= sort(objArray);
    if(objResultArray1==null){
    System.out.println("Output after first operation is null. ");
    }else{
    System.out.println("Displaying contents of result array: ");
    
    for(MailBox mailbox:objResultArray1){
    System.out.println(mailbox.id+" " + mailbox.s1+" " + mailbox.s2+" ");
    }
    }
    }
    
    static MailBox[] sort(MailBox[] arr){
         for (int i = 0; i < arr.length; i++) {
             for (int j =i+1; j < arr.length; j++) {
              if(arr[i].id>arr[j].id){
                  MailBox tem=null;
                  tem=arr[j];
                  arr[j]=arr[i];
                  arr[i]=tem;
              }   
             }
             
         }
         return arr;
     }


    static MailBox[] getEvenPositionMailBox(MailBox[] arr){
        List<MailBox> ls = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
        if(i%2==0){
           ls.add(arr[i]);
        }
    }
         MailBox[] arrls =new MailBox[ls.size()];
         for (int i = 0; i < ls.size(); i++) {
             arrls[i]=ls.get(i);
         } 
         return arrls;
    }
}

class MailBox{
    int id; String s1,s2;
    MailBox(int id,String s1,String s2){
        this.id=id;
        this.s1=s1;
        this.s2=s2;
    }
}