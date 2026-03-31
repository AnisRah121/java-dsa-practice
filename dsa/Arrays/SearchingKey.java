package Arrays;

public class SearchingKey {
    static void main() {
        int[]a={4,5,6,7,8,91,2,3};
        System.out.println(find(a,91));


    }
    public static int find ( int[] a, int key){
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i ;
            }


        }
        return -1;
    }
}
