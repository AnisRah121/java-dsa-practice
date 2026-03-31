package JAVA_8.ConstructorReference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("anis", "rokib", "mukib");

        List<Student> students = names.stream()
                .map(Student::new)   // Constructor reference
                .collect(Collectors.toList());


        List<Student> students1 = names.stream()
                .map(i->new Student(i))   // Lamda Expression
                .collect(Collectors.toList());


        students.forEach(s -> System.out.println(s.getName()));; // Print names

        students1.forEach(s -> System.out.println(s.getName()));; // Print names

    }
}
