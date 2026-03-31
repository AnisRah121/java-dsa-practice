package JAVA_8.StaticMethods;

public class MyClass implements A {
//    public void sayHello(){
//        System.out.println("Hello");
//    }
//    static void main() {
//        MyClass myClass = new MyClass();
//        myClass.sayHello();
        public static void sayGM(){
        System.out.println("Class Good Morning");
         }
        static void main() {
        MyClass.sayGM();//Class call
        A.sayGM();//Interface call
       }
}
