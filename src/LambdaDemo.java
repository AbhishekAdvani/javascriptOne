@FunctionalInterface
interface MyFunctionalInterface {
    void greetHello();

}

public class LambdaDemo {
    public static void main(String[] args) {
        MyFunctionalInterface greet = () -> System.out.println("hello world");
        greet.greetHello();
    }
}