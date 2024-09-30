package com.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// for integer

//public class A {
//    public static void main(String[] args) {
//        Predicate<Integer> val =x->x==100;
//        boolean result = val.test(100);
//        System.out.println(result);
//    }
//
//
//}

            // for string
//            public class A {
//                public static void main(String[] args) {
//                    Predicate<String> val =x->x.equals("mike");
//                    boolean result = val.test("Rohan");
//                    System.out.println(result);
//                }
//            }

//  public class A{
//      public static void main(String[] args) {
//          List<Integer> data = Arrays.asList(100, 10, 35, 89, 65, 45, 78, 65, 700,500,450,850);
//          List<Integer> newdata = data.stream().filter(x -> x > 100).collect(Collectors.toList());
//          System.out.println(newdata);
//      }
//  }

//public class A{
//    public static void main(String[] args) {
//        List<String> data = Arrays.asList("mike","adam","madan","mohan","bike");
//        List<String> newdata = data.stream().filter(x -> x.startsWith("m")).collect(Collectors.toList());
//        System.out.println(newdata);
//    }
//}
              // even number

//public class A{
//      public static void main(String[] args) {
//          List<Integer> data = Arrays.asList(100, 10, 35, 89, 65, 45, 78, 65, 70,56,45,50);
//          List<Integer> newdata = data.stream().filter(x -> x%2==0).collect(Collectors.toList());
//          System.out.println(newdata);
//      }
//  }

              // odd number
//public class A{
//    public static void main(String[] args) {
//        List<Integer> data = Arrays.asList(100, 10, 35, 89, 65, 45, 78, 65, 70,56,45,50);
//        List<Integer> newdata = data.stream().filter(x -> x%2!=0).collect(Collectors.toList());
//        System.out.println(newdata);
//    }
//}
//

                // Function Functional Interfaces:
        // It takes input and produce output

// public class A {
//     public static void main(String[] args) {
//         Function<String,Integer> x =s->s.length();
//         Integer  val = x.apply("mike");
//         System.out.println(val);
//     }
//}


//public class A{
//    public static void main(String[] args) {
//        Function<Integer,Integer> x=s->s*s;
//        Integer val = x.apply(100);
//        System.out.println(val);
//    }
//}


//public class A{
//    public static void main(String[] args) {
//        Function<String,Integer> x=s->s.length();
//        Integer val = x.apply("vidyabhusahan");
//        System.out.println(val);
//    }
//}

//public class A{
//    public static void main(String[] args) {
//        Function<Integer,Integer> x= s->s+5;
//        Integer val = x.apply(99);
//        System.out.println(val);
//    }
//}

//public class A{
//    public static void main(String[] args) {
//        Function<Integer,Integer> x= s->s/9;
//        Integer val = x.apply(99);
//        System.out.println(val);
//    }
//}


//public class A {
//    public static void main(String[] args) {
//        List<Integer> data = Arrays.asList(10, 20, 30, 45, 78, 98, 56);
//        List<Integer> newdata = data.stream().map(x -> x * x).collect(Collectors.toList());
//        System.out.println(newdata);
//    }
//}

//public class A {
//    public static void main(String[] args) {
//        List<Integer> data = Arrays.asList(10, 71, 45, 54, 84, 78, 56);
//        List<Integer> newdata = data.stream().map(x -> x + 10).collect(Collectors.toList());
//        System.out.println(newdata);
//    }
//}

//public class A {
//    public static void main(String[] args) {
//        List<String> data = Arrays.asList("mike", "Adam", "mohan", "stallin", "rahul");
//        List<String> newdata = data.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
//        System.out.println(newdata);
//    }
//}

//public class A {
//    public static void main(String[] args) {
//        List<String> data = Arrays.asList("mike", "Adam", "mohan", "stallin", "rahul");
//        List<Integer> newdata = data.stream().map(x -> x.length()).collect(Collectors.toList());
//        System.out.println(newdata);
//    }
//}

//public class A {
//    public static void main(String[] args) {
//        List<String> data = Arrays.asList("mike", "Adam", "mohan", "stallin", "rahul");
//        List<String> newdata = data.stream().sorted().collect(Collectors.toList());
//        System.out.println(newdata);
//    }
//
//}


//public class A {
//    public static void main(String[] args) {
//        List<String> data = Arrays.asList("mike", "Adam", "mike", "stallin", "Adam");
//        List<String> newdata = data.stream().distinct().collect(Collectors.toList());
//        System.out.println(newdata);
//    }
//
//}


//            consumer Functional Interface :
//           It takes one input & produce no output

//public class A {
//    public static void main(String[] args) {
//        Consumer<String> x=s-> System.out.println(s);
//        x.accept("mike");
//    }
//}
//



public class predicate_functional_exmple {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Aman", "Bob", "Charlie");
        Consumer<String> val = s -> System.out.println(s);
        names.forEach(val);
    }
}