

public class Box2 {
    int x;
    int y;
    public Box2(int a,int b){
        this.x=a;
        this.y=b;

    }
    public static void main(String[] args){
        Box2 box=new Box2(3,4);
        System.out.println(box.x+" "+box.y);
    }

}
