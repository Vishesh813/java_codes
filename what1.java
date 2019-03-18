class Test{
    public static void main(String[] args) {
      Test t=new Test();
      t.start();// hackerearth hack hackathons
    }

    void start(){
        String s1="hack";
        String s2= val(s1);
        
        System.out.println(s1+" "+s2);
    }
    String val(String s1){
        s1=s1+"earth";
        System.out.print(s1+" ");
        return "hackathons";
    }
}