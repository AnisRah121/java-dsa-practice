package Practice;

public class Cat extends Animal{
    @Override
    void makeSound()
    {
        System.out.println("Meow");
    }

    static void main() {
        Cat c = new Cat();
        c.makeSound();
        System.out.println(c.leg);
    }
}
