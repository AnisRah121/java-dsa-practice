package Practice;

public class Student {
    String name;
    Long phnum;
    static int count;

    Student(String n, Long p) {
        name = n;
        phnum = p;
        count++;
    }

    void display() {
        System.out.println("Name=" + name);
        System.out.println("phnum=" + phnum);
        System.out.println("      ");
    }
}
    class Test3 {
        static void main(String[] args) {
           Student s1= new Student("deepak",123452L);
           Student s2= new Student("anis",121322314L);
            System.out.println("     ");
            s1.display();
            s1.display();
        }
    }


