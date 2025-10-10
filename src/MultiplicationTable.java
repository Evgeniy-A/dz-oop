import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        System.out.println(multiplication(number));
    }

    public static String multiplication(int number) {
        StringBuilder multiplicationResult = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            multiplicationResult.append(String.format("%2d * %2d = %3d%n", number, i, number * i));
        }
        return multiplicationResult.toString();
    }
}
