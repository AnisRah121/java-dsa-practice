package ComparableOrComparator;


import java.util.*;

class Circle implements Comparable<Circle> {
    double radius;

    Circle(double radius)
    {
        this.radius = radius;
    }

    // Natural sorting based on radius
    @Override
    public int compareTo(Circle c)
    {
        return Double.compare(this.radius, c.radius);
    }

    @Override
    public String toString()
    {
        return "Radius: " + radius;
    }
}

public class CircleComparableExample {
    public static void main(String[] args) {

        List<Circle> circles = new ArrayList<>();
        circles.add(new Circle(5.5));
        circles.add(new Circle(2.0));
        circles.add(new Circle(3.8));
        circles.add(new Circle(1.2));

        Collections.sort(circles);

        for (Circle c : circles) {
            System.out.println(c);
        }
    }
}
