package DevOps.EXP3_JENKINS;

public class App {
    public static void greeting() {
        System.out.println("Hello World!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        greeting();
        int result = add(3, 5);
        System.out.println("The sum of 3 and 5 is: " + result);
    }
}
