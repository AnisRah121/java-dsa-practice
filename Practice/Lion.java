package Practice;

public class Lion extends Animal {
    @Override
    void makeSound()
    {
        System.out.println("Reow");
    }

    static void main() {
        Lion l = new Lion();
        l.makeSound();
        System.out.println(l.leg);
    }
}
