public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        ValidationUtils.requireNonBlank("Имя", name);
        ValidationUtils.requireInRange("возраст", age, 16, 85);
        ValidationUtils.requireInRange("оценка", grade, 0, 5);
        this.name = name;
        this.age = age;
        this.grade = grade;
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
        ValidationUtils.requireInRange("возраст", age, 16, 85);
        this.age = age;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        ValidationUtils.requireInRange("оценка", grade, 0, 5);
        this.grade = grade;
    }

    public String getStudentInfo() {
        return String.format("Студент %s, возраст: %d, оценка: %.2f.", name, age, grade);
    }
}