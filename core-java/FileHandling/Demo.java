package FileHandling;
import java.io.File;
import java.io.IOException;
public class Demo {
    static void main() throws IOException {
       // File f = new File ("D:\\java\\encapsulation\\src\\FileHandling\\A.txt");
      //  System.out.println(f.mkdir());
//        System.out.println(f.createNewFile());
//        System.out.println(f.canRead());
//        System.out.println(f.canWrite());
//        System.out.println(f.canExecute());
//        System.out.println(f.getAbsolutePath());
//
//        File f1 = new File("D:\\java\\encapsulation\\src\\FileHandling\\B.txt");
//
//        System.out.println(f1.canRead());
//        System.out.println(f1.canWrite());
//        System.out.println(f1.canExecute());
//        System.out.println(f.renameTo(f1));
//
//        File f2 = new File("D:\\java\\encapsulation\\src\\FileHandling\\C.txt");
//        System.out.println(f2.canRead());
//        System.out.println(f2.canWrite());
//        System.out.println(f2.canExecute());
//        System.out.println(f.renameTo(f2));
        File f3 = new File("D:\\java\\encapsulation\\src\\FileHandling\\D.txt");
        System.out.println(f3.createNewFile());
        System.out.println(f3.canRead());
        System.out.println(f3.canWrite());
        System.out.println(f3.canExecute());
        System.out.println(f3.getAbsolutePath());
    }


}
