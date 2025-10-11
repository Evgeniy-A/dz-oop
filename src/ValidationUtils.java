import java.time.Year;

public class ValidationUtils {
    public static void requireNonBlank(String fieldName, String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(fieldName + " значение не может быть пустым или null");
        }
    }

    public static void requireInRange(String fieldName, int value, int min, int max) {
        if (value < min || value > max) {
            throw new IllegalArgumentException(
                    String.format("Значение %s должно быть в диапазоне [%d, %d]", fieldName, min, max)
            );
        }
    }

    public static void requireInRange(String fieldName, double value, double min, double max) {
        if (value < min || value > max) {
            throw new IllegalArgumentException(
                    String.format("Значение %s должно быть в диапазоне [%.2f, %.2f]", fieldName, min, max)
            );
        }
    }

    public static void requirePositive(String fieldName, double value) {
        if (value <= 0) {
            throw new IllegalArgumentException(fieldName + " значение должно быть больше 0");
        }
    }

    public static void requireNotFutureYear(int year) {
        int currentYear = Year.now().getValue();
        if (year > currentYear) {
            throw new IllegalArgumentException("Год не может быть больше текущего года");
        }
    }
}