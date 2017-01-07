
public class MyChaining {

	//default constructor of the class
	   public MyChaining(){
	         System.out.println("Default constructor");
	   }
	   public MyChaining(String str){
	         this();
	    	 System.out.println("Parametrized constructor with single param");
	   }
	   public MyChaining(String str, int num){
	         //It will call the constructor with String argument
	    	 this("Hello"); 
	    	 System.out.println("Parametrized constructor with double args");
	   }
	   public MyChaining(int num1, int num2, int num3){
	   	// It will call the constructor with (String, integer) arguments
	        this("Hello", 2);
	        System.out.println("Parametrized constructor with three args");
	   }
	   public static void main(String args[]){
	        //Creating an object using Constructor with 3 int arguments
		   MyChaining obj = new MyChaining(5,5,15);
	   }
}
