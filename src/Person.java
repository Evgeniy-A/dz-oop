public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        ValidationUtils.requireNonBlank("Имя", name);
        ValidationUtils.requireInRange("возраст", age, 0, 100);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        ValidationUtils.requireNonBlank("Имя", name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        ValidationUtils.requireInRange("возраст", age, 0, 100);
        this.age = age;
    }

    public void introduce() {
        System.out.printf("Привет, меня зовут %s и мне %d лет.%n", name, age);
    }
}