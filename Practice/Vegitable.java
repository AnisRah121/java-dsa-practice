package Practice;

abstract class  Vegitable
{
     abstract  void dish();
}
class Carrot extends Vegitable
{
    @Override
    void dish()
    {
        System.out.println("halwa");
    }
}
class Potato extends Vegitable
{
    @Override
    void dish()
    {
        System.out.println("french fry");
    }
}
class Curliflower extends Vegitable
{
    @Override
    void dish()
    {
        System.out.println("gobi bhaji");
    }
}
class Cook
{
    void experiment(Vegitable v)
    {
        System.out.println("cooking");
        v.dish();
        System.out.println("------");

    }

}
class Test15
{
    public static void main(String[] args)
    {
        Cook c = new Cook ();
        c.experiment(new Carrot());
        c.experiment(new Potato());
        c.experiment(new Curliflower());
    }
}
