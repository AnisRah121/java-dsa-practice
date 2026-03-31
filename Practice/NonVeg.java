package Practice;

class NonVeg extends Zomato{
    String restraunt = "Ambur";

    void dish()
    {
        System.out.println("Biriyani");
    }

    static void main() {
        Zomato z = new NonVeg();//Upcasting
        System.out.println(z.uid);
        System.out.println(z.password);
        z.login();

        NonVeg n = (NonVeg) z;
        System.out.println(n.uid);
        System.out.println(n.password);
        n.login();
        System.out.println(n.restraunt);
        n.dish();
    }
}