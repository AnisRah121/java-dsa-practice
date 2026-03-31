package JAVA_8;

import InnerClass.InnerClass;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {

        Optional<String> name = getName(2);
//        if (name.isPresent()){
//            System.out.println(name.get());
//        }
//
//        name.ifPresent( System.out::println);
        String nameTobeUsed = name.orElse("NA");
        System.out.println(nameTobeUsed);


        Optional<Integer> len = name.map(x->x.length());
        len.ifPresent(System.out::println);

    }

    public static Optional<String> getName(int id) {
        String name = "anis";
        return Optional.of(name);
    }
}
