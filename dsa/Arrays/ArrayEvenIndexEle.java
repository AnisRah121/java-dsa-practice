package Arrays;

public class ArrayEvenIndexEle {
    static void main() {
        int[] a = {10,20,30,40,50,60,70,80,90,100};

        for (int i = 0; i <a.length ; i++) {
            if(i%2==0){
                System.out.println(a[i]);
            }
        }
            System.out.println(".......");


        for (int i = 0; i <a.length ; i++) {
            if(i%2!=0)
            {
                System.out.println(a[i]);
            }
        }

    }
}
