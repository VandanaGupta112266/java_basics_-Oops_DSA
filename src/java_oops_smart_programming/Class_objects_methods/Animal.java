//import java.lang.String;
import java.util.*;
class Animal{

	public String myColor;
	public void eat(String a) {
		myColor = a;
		System.out.println("i love eating & My color is " + myColor);
	}

	public void run(){
		System.out.println("i love running");

	}
	public int age;

	public static void main(String[] args){
	 System.out.println(1);
	  	//creating an object to use above created methods
		Animal dog =new Animal();  //object 1
		Animal cat=new Animal();	//object 2

		//using methods and properties
//		dog.myColor="Brown";
		dog.eat("pink");//pass the color as a parameter
		dog.run();
		dog.age=5;
		System.out.println("Age of a Dog is "+dog.age);

		cat.eat("white");//pass the color as a parameter

		Bird koyal =new Bird(); //1st object of Bird class
		koyal.fly();



	}

}
//2nd  class
class Bird{

	void fly(){
		System.out.println("i Love Flying");
	}
}
