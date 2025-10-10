public class StudentFormatter {
    public static void main(String[] args) {
        String[] students = {"Иванов  ", "Петров ", "Сидоров"};
        System.out.println(formatStudents(students));
    }

    public static String formatStudents(String[] students) {
        StringBuilder studentsColumn = new StringBuilder();
        for (String student : students) {
            studentsColumn.append(student.trim()).append("\n");
        }
        return studentsColumn.toString();
    }
}