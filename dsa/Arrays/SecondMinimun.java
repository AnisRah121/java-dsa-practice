package Arrays;

public class SecondMinimun {
    static void main() {
        int []a={5,4,1,8,9,2};
        int min=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for (int i = 0; i <a.length ; i++) {
            if(a[i]<min)
            {
                min2=min;
                min=a[i];
            } else if (a[i]>min && a[i]<min2)
            {
                min2=a[i];
            }
        }
        System.out.println(min);
        System.out.println(min2);
    }
}
