package Practice;

class  Bike
{

    int regnum;
    String color;
    public static int count =1000;


    Bike(String c){
        regnum=count;
        count++;
        color=c;

    }
    void display(){
        System.out.println("Regnum"+regnum);
        System.out.println("color"+color);
        System.out.println("            ");

    }

}class Test4
{
    public static void main(String[] args)
    {
        Bike b1=new Bike("red");
        Bike b2=new Bike("black");
        Bike b3=new Bike("black");
        Bike b4=new Bike("black");
        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}

