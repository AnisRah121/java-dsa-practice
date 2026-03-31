package Arrays;

public class MaxElement {
    static void main() {
        int[] a ={1,2,3,4,5,6,7,8};
        int max = 0;
        for (int i = 0; i <a.length; i++) {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println(max);
        for (int ele : a)
        {
            if(ele>max){
                max=ele;
            }
        }
        System.out.println(max);
    }
}
