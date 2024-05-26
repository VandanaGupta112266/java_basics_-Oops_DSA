public class MethodOverRiding {
    protected Object show(){
        System.out.println("1");
        return null;
    }
    void show(int a,String b){
        System.out.println("a and b");
    }
    void show(String c,int d){
        System.out.println("c and d");
    }
}
class XYZ extends MethodOverRiding{
      protected String show(){
        System.out.println("2");
        return null;
    }
    void show(int e,String f){
        System.out.println("e and f ");
    }

    public static void main(String[] args) {
        MethodOverRiding obj1 =new MethodOverRiding();
        XYZ obj2 =new XYZ();
        obj1.show();  //1
        obj2.show(); //2
        obj2.show("abc",1);  //c and d
        obj2.show(2,"ef");  //e and f
        obj1.show(1,"ab"); //a and b

    }
}
