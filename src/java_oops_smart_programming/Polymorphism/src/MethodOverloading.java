public class MethodOverloading {
    void show(int a,int b,int c){
        System.out.println(a+" "+b+" "+c);
    }

    void show(int b,int a){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        MethodOverloading obj =new MethodOverloading();
        obj.show(5,10,5);
        obj.show(10,5);
    }
}