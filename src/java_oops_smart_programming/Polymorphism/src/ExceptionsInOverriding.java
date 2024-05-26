public class ExceptionsInOverriding {
    void show()
    {
        System.out.println("1");
    }
}
class ABC extends ExceptionsInOverriding{
    void show() throws  Exception //ArithmeticException - its an unchecked exception so no error
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        ExceptionsInOverriding ob1 =new ExceptionsInOverriding();
        ob1.show();
        ABC ob2 =new ABC();
        ob2.show();

    }
}
