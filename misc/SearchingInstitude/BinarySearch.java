package SearchingInstitude;

public class BinarySearch {

    static void main() {
        int [] a = {1,2,3,4,5,6,7,8,9};
//        int z=search(a,7);
//        int y=search(a,100);
        int b=searchRe(a,8,0,a.length-1);
//        System.out.println(z);
//        System.out.println(y);
        System.out.println(b);
    }
//    public static int search(int[]a,int key){
//        int low=0;
//        int high= a.length-1;
//        while(low<=high){
//            int mid = (low+high)/2;
//            if (key==a[mid]) return mid;
//            if(key<a[mid])
//            {
//                high=mid-1;
//            }
//            else low=mid+1;
//        }
//        return -1;
//    }

    public static int searchRe(int[]a,int key,int low,int high){
            if (low>high) return -1;
              int mid = (low + high) / 2;
            if (key == a[mid]) return mid;
            else if (key < a[mid]) {
                return searchRe(a, key, low, mid - 1);
            }
            else
                return searchRe(a, key, mid + 1, high);
    }
}
