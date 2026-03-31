package Arrays;

public class SmallestEle {
    static void main() {
        int[] a ={1,2,3,4,5,6,7,8};
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i <a.length; i++) {
            if(a[i]<smallest)
            {
                smallest=a[i];
            }
        }
        System.out.println(smallest);
        for (int ele : a)
        {
            if(ele<smallest){
                smallest=ele;
            }
        }
        System.out.println(smallest);
    }
}
