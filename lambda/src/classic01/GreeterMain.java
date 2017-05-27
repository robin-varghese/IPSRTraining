package classic01;

import impl.GreetOnam;
import intc.Greeting;


public class GreeterMain {

	
	public void greet(Greeting greetingAccordingly){
		greetingAccordingly.perform();
		System.out.println("trying sonarlint");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GreeterMain ourGreeter = new GreeterMain();
		GreetOnam thisGreeting = new GreetOnam();
		ourGreeter.greet(thisGreeting);
		
		Greeting myLambdaExp = () -> System.out.println ("Lambda greeting");
		
		MyLambdaAdd mySecondExp = (int a, int b) ->{
			
			System.out.println ("Added numbers" + a+b);
		};
		
		Greeting myLambdaExp2 = () -> System.out.println ("Lambda greeting - reused the interface");
	}

}



interface MyLambdaAdd{
	
	void addTwoNUmbers (int a, int b);
	
}