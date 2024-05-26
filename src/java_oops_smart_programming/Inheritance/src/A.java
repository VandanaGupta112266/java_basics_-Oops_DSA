//Types of Inheritance

//1.Single Inheritance
public class A {
    void showA(){
        System.out.println("A class method");
    }
}
class B extends A{
    void showB(){
        System.out.println("B class method");
    }

    public static void main(String[] args) {

        A ob2=new A();
        ob2.showA();
       // ob2.showB(); cannot call

        B ob1=new B();
        ob1.showA();
        ob1.showB();
    }
}
//output
//A class method
//A class method
//B class method


//2.multiple inheritance

//public class A {
//    void showA(){
//        System.out.println("A class method");
//    }
//}
//class B extends A{
//    void showB(){
//        System.out.println("B class method");
//    }
//
//    public static void main(String[] args) {
//
//        A ob1=new A();
//        ob1.showA();
//        // ob1.showB(); cannot call
//
//        B ob2=new B();
//        ob2.showA();
//        ob2.showB();
//
//        C ob3=new C();
//        ob3.showA();
//        ob3.showB();
//        ob3.showc();
//    }
//}
//class C extends B{
//    void showc(){
//        System.out.println("c class method");
//    }
//}
//output
//A class method
//A class method
//B class method
//A class method
//B class method
//c class method

//3.heirarchial inheritance
//public class A {
//    void showA(){
//        System.out.println("A class method");
//    }
//}
//class B extends A{
//    void showB(){
//        System.out.println("B class method");
//    }
//
//    public static void main(String[] args) {
//
//        A ob1=new A();
//        ob1.showA();
//        // ob1.showB(); //cannot access
//
//        B ob2=new B();
//        ob2.showA();
//        ob2.showB();
//
//        C ob3=new C();
//        ob3.showA();
//       // ob3.showB();  //cannot access
//        ob3.showC();
//    }
//}
//class C extends A{
//    void showC(){
//        System.out.println("C class method");
//    }
//}
//output
//A class method
//A class method
//B class method
//A class method
//C class method

//4.multiple Inheritance not possible in java

//public class A {
//    void showA(){
//        System.out.println("A class method");
//    }
//}
//class B {
//    void showB(){
//        System.out.println("B class method");
//    }
//
//    public static void main(String[] args) {
//
//        A ob1=new A();
//        ob1.showA();
//        // ob1.showB(); //cannot access
//
//        B ob2=new B();
//        ob2.showA();
//        ob2.showB();
//
//        C ob3=new C();
//        ob3.showA();
//        // ob3.showB();  //cannot access
//        ob3.showC();
//    }
//}
//class C extends A,B{  //extends A,B - not valid to write
//    void showC(){
//        System.out.println("C class method");
//    }
//}

//5.hybrid inheritance is also not possible in java





