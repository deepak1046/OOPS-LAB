import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");

        System.out.println("Student List:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
