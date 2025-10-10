public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        if (name == null || name.isBlank() || age < 16 || age > 85 ||
                grade < 0 || grade > 5) {
            throw new IllegalArgumentException("Ошибка данных");
        }
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isBlank()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 16 && age < 85) {
            this.age = age;
        }
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 5) {
            this.grade = grade;
        }
    }

    public String getStudentInfo() {
        return String.format("Студент %s, возраст: %d, оценка: %.2f.", name, age, grade);
    }
}
