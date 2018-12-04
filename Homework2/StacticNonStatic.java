package homework2;

public class StacticNonStatic {
	
	String name = "Sohag";//non static variable
	static int age = 39; //static variable as we put static
	
	
	

	public static void main(String[] args) {
		//now lets try to call static method. we can do it two ways.
     sum();//calling directly
     StacticNonStatic.sum(); //calling by class name
        
     //now lets try to call static variable. we can do it two ways.
     System.out.println(age);//calling directly
     System.out.println(StacticNonStatic.age);//calling by class name
     
     
     //now lets try call non static method and variable. we have to create obj for that
     
     //creating obj
      StacticNonStatic obj = new StacticNonStatic();
      //now we have object of the class that obj that represents class properties
     obj.sendMail();//calling method by obj
     //as we need println method to show the result so we need to create sysout & in parameter we call variable name.
     System.out.println(obj.name); //calling variable by obj
     	}
	
	
	public void sendMail() { //non static method
		System.out.println("This is non static method");
		}
	public static void sum() {//static method
		System.out.println("This is static method to call this you can call directly or calling class name");
		
}
	}
/*Note: Can access static method by using obj reference? Ans: yes 
 * ex: obj.sum();
 * but there will be a warning. because, for static method we dont need obj we call directly
 */	


/* step of this project to check calling static and no static vriable and method
 * 1. take class with main method
 * 2. create two variable one static and one non static
 * 3.create two method after main method closing curly brace with sysout along with message inside. one static and one non static.
 * 4.start calling. static method: we can call directly (sum) and calling class name(StacticNonStatic.sum) we dont need sysout alreay we have after method
 * 5.call static variable by creating sysout and inside parrenthasis call variable directly (age)
 * 6.call static variable by creating sysout and inside parrenthasis call variable calling class name (StacticNonStatic.age)
 * 7. now call non static method by creating obj
 * 8. caling non static method by obj (obj.sendMail()). we dont need sysout we had after method
 * 9. calling non static variable by obj after creating sysout and cll by obj inside parenthesis (obj.name)
 * 10. run*/

