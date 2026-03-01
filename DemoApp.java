import com.example.Calculator;

public class DemoApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add: " + calc.add(10, 20));
        System.out.println("Subtract: " + calc.subtract(50, 30));
    }
}
