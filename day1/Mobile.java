package week1.day1;

public class Mobile {
    String mobilemodel = "Redmi Note 9 Prox Max";
    int mobileweight = 145;
    boolean isFullCharged = true;
    double mobileCost=14000.6;
	
//accessSpecifier returnType methodName() {}
public void makeCall() {
    System.out.println("first method - I love using my redmi mobile");
    System.out.println("mobilemodel");
}
    
public void sendmsg() {
	System.out.println("Redmi has good features");
}
public static void main(String[] args) {
  //className objectName = new ClassName()
	Mobile redmi = new Mobile();

  //use the object to call the method
	redmi.makeCall();
	redmi.sendmsg();

// calling the global variables into main method
	
    System.out.println(redmi.mobilemodel);
    System.out.println(redmi.mobileweight);
    System.out.println(redmi.isFullCharged);
    System.out.println(redmi.mobileCost);
}	
}

