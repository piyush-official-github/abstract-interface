Java 8 introduced three new capabilities to interfaces: default methods, static methods, and private methods. 
     default void print() {
        System.out.println("Printing...");
    }
    static int getArea() {
        return 100;  
    }
    private void log(String message) {
        System.out.println(message);
    }
