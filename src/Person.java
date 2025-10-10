public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if ((name == null) || name.isBlank() || age < 0 || age > 100) {
            throw new IllegalArgumentException("Ошибка данных");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ((name != null) && !name.isBlank()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 100) {
            this.age = age;
        }
    }

    public void introduce() {
        System.out.printf("Привет, меня зовут %s и мне %d лет.%n", name, age);
    }
}