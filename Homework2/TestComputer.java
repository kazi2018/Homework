package homework2;

public class TestComputer {
	
	
	//global variables: the scope of global variables will be be available across all the functions with same conditions.
	
String name = "Mac Pro";//non static global variable
static int price = 2500;//static global variable



	public static void main(String[] args) {

		//how to call static methods and variables
		//1. direct calling:
		myMacpro();
		
		//2. calling by class name:
		
		TestComputer.myMacpro();
		
		System.out.println(price);
		System.out.println(TestComputer.price);
		
		//how to call non static methods and variables
		TestComputer obj = new TestComputer();
		obj.buyMacpro();
		System.out.println(obj.name);
		
		//can I access static methods by using objects reference?yes
		
		obj.buyMacpro();

	}
	
	public void buyMacpro () {//non static method
		
		System.out.println("I want to buy" +name);
		
		
	}

	public static void myMacpro () {//static mehtod
		
		System.out.println("my mac pro price is " +price);
		
	}
}
