package Practice;

import com.engineeringdigest.corejava.animals.C;

public class Circle {
    int radius;
    Circle(int radius)
    {
        this.radius= radius;
    }

    @Override
    public boolean equals(Object arg)
    {
        if (!(arg instanceof Circle)) return false;
        return radius==((Circle)arg).radius;

    }


    @Override
    public String toString(){
        return "Circle[radius="+radius+"]";
    }

    static void main() {
        Circle c1 = new Circle(50);
        Circle c2 = new Circle(50);
        System.out.println(c1==c2);
        System.out.println(c1.equals(c2));
    }
}