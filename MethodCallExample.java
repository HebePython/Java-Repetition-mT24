public class MethodCallExample {

    public static void main(String[] args) {
    System.out.println("Starting main");
    methodA();
    System.out.println("Ending main");

    }
    public static void methodA() {
    System.out.println("Starting A");
    methodB();
    System.out.println("Ending A");
    }

    public static void methodB() {
    System.out.println("Starting B");
    System.out.println("Ending B");
    }
}
