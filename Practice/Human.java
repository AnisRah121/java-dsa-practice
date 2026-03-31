package Practice;

public class Human {
    Heart h;
    Human()
    {
        h= new Heart();
    }
    void breath()
    {
        h.pump();
        System.out.println("breathing");
    }

    static void main() {
        Human h = new Human();
        h.breath();
    }
}
