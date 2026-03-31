package Practice;

public class Dog extends Animal{
    @Override
    void makeSound()
    {
        System.out.println("Bhow");
    }
    static void main() {
        Dog d = new Dog();
        d.makeSound();
        System.out.println(d.leg);
    }

}
