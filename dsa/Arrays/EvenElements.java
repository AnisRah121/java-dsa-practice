package Arrays;

public class EvenElements {
    static void main() {
        int[] a ={1,2,3,4,5,6,7,8,9,10};

        //even elements
        for (int i = 0; i <a.length ; i++) {
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
}
