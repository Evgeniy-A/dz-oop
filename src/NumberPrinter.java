public class NumberPrinter {
    public static void main(String[] args) {
        System.out.println(createNumbersTable());
    }

    public static String createNumbersTable() {
        StringBuilder numbers = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            numbers.append(String.format("%2d ", i));
            if (i % 20 == 0) {
                numbers.append("\n");
            }
        }
        return numbers.toString();
    }
}
