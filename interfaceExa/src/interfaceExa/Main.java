package interfaceExa;

interface Animal {
	  public abstract void sound();
      public void sleep();
	}

	class Pig implements Animal {
	  public void sound() {
	    System.out.println("chal nikal yarrr");
	  }
	  public void sleep() {
	    System.out.println("sone de bhai yarrr");
	  }
	}
	
	class Main {
	 public static void main(String[] args) {
		    Pig myPig = new Pig(); 
		    myPig.sound();
		    myPig.sleep();
		  }
}
