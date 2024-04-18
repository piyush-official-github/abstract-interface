package abstractClass;

abstract class MotorBike {
	  abstract void brake(); // abstract method
	  void petrol() {} ;     // non - abstract method
	}

	class SportsBike extends MotorBike {
	    
	  public void brake() {
	    System.out.println("gadi rok bhai ");
	  }
	  public void petrol() {
		  System.out.println("Petrol bhara hua hai");
	  }
	}

	class MountainBike extends MotorBike {
	    
	  public void brake() {
	    System.out.println("brake lga le re bhai");
	 }
	  public void petrol() {
		  System.out.println("tel dala le bhai");
	  }
	}

public class Main {

	public static void main(String[] args) {
		    MountainBike m1 = new MountainBike();
		    m1.brake();
		    m1.petrol();
		    SportsBike s1 = new SportsBike();
		    s1.brake();
	}

}
