public class Car {
    private String make;
    private String model;
    private int year;
    private double price;

    public Car(String make, String model, int year, double price) {
        ValidationUtils.requireNonBlank("Марка", make);
        ValidationUtils.requireNonBlank("Модель", model);
        ValidationUtils.requireNotFutureYear(year);
        ValidationUtils.requirePositive("Стоимость", price);
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        ValidationUtils.requireNonBlank("Марка", make);
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        ValidationUtils.requireNonBlank("Модель", model);
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        ValidationUtils.requireNotFutureYear(year);
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        ValidationUtils.requirePositive("Стоимость", price);
        this.price = price;
    }

    public String getCarDetails() {
        return String.format("Марка: %s, Модель: %s, Год выпуска: %d, Цена: %.2f", make, model, year, price);
    }
}
