package Practice;

class Veg extends Zomato{
    String restraunt="Udupi";
    void dish()
    {
        System.out.println("paneer");
    }

    static void main() {
        Zomato z = new Veg();//Upcasting
        System.out.println(z.uid);
        System.out.println(z.password);
        z.login();

        Veg v = (Veg) z;
        System.out.println(v.uid);
        System.out.println(v.password);
        v.login();
        System.out.println(v.restraunt);
        v.dish();
    }
}