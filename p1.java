class Test {
   public static void main(String[] args) {
   //   int[] a = new int[]{0,1,2,3,4,5,6,7,8,9};
   //   int n=8;
   //   n=a[a[n/2]+1];
   //   System.out.println(n); 
   // int sum=0;
   // for (int i = 0,j=0; i < 5 && j<5; ++i,j=i+1) {
   //    sum+=i;
   // }
   // System.out.println(sum);
/* hkjhjk */
   //int x=100;
   //double 2_y=100.0;
  // boolean z= (x=y);
   //System.out.println(z);
   Test t =new Test();
   t.start();
   }
 void start(){
    boolean b1=false;
    boolean b2=false;
    b2=fix(b1);
    System.out.println("b1:"+b1+"b2:"+b2);
 }
   boolean fix(boolean b1){
      System.out.println("b1:"+b1); 
      b1=true;
       return b1;
   }
}