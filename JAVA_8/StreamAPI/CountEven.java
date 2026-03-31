package JAVA_8.StreamAPI;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountEven {
    static void main() {
          List<Integer> li = Arrays.asList(1,2,3,4,45,56,7,78);
//        long count = li.stream().filter(i->i%2==0).count();
//        System.out.println(count);
//        List<Integer> list =  li.stream().map(i->i*i).collect(Collectors.toList());
//        System.out.println(list);

        List<Integer> lis =  li.stream().filter(i->i%2==0).map(i->i*i*i).collect(Collectors.toList());
        System.out.println(lis);

    }
}
