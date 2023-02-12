public class MethodOverloading {
    static int plus_Method(int x,int y){
        return x+y;
    }
    static double plus_Method(double x,double y){
        return x+y;
    }
    public static void main(String[] args){
        int intiger=plus_Method(3,5);
        double doublee=plus_Method(3.5,5.5);
    }
}
