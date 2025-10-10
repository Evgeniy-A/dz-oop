import java.time.Year;

public class Car {
    private static final int CURRENT_YEAR = Year.now().getValue();
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make, String model, int year, double price) {
        if (make == null || make.isBlank() || model == null ||
                model.isBlank() || year > CURRENT_YEAR || year <= 1950 ||
                price <= 0) {
            throw new IllegalArgumentException("Ошибка данных");
        }
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if ((make != null) && !make.isBlank()) {
            this.make = make;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if ((model != null) && !model.isBlank()) {
            this.model = model;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= CURRENT_YEAR && year >= 1950) {
            this.year = year;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public String getCarDetails() {
        return String.format("Марка: %s, Модель: %s, Год выпуска: %d, Цена: %.2f", make, model, year, price);
    }
}
