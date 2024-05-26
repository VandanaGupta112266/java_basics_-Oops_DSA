public class Test {
    int i;
    String s;
    //1.default constructor made by compiler

    //2.user defined or no argument constructor
    Test(){
        System.out.println("No argument constructor");
    }
    //parameterized constructor
    Test(int a){
        System.out.println("parameterized constructor");
    }




    public static void main(String[] args) {
        //1.default constructor made by compiler
//        Test t = new Test();
//        System.out.println(t.i); //Answer 0 because of default constructor
//        System.out.println(t.s); //Answer null because of default constructor

        //2.user defined or no argument constructor
//        Test t = new Test();
//        System.out.println(t.i);
//        System.out.println(t.s);
        //output:
//        No argument constructor
//        0
//        null

        //parameterised constructor
        Test t = new Test(10);
        //output
        //parameterized constructor


    }

}
