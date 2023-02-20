public class Example2 {
    private int var;

    public Example2(){
        this.var=6;
    }

    public Example2(int num){
        this.var=num;
    }
    public int getvalue(){  
        return var;
    }
    public static void main(String[] args){

        Example2 obj=new Example2(10);
        System.out.println("ver is "+obj.getvalue());
    }
}
