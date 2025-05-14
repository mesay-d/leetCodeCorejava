import POJO.Employee;
import POJO.TeacherFunction;
import abstractexample.*;
import calculator.Calculator;
import school.Teacher;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) throws IOException {
        Shape shape1 = new Circle(5);
        Shape rect= new Rectangle(4.00,8.00);
        Shape tra=new Trapizod(3,5,8);

//        System.out.println( rect.calculateArea());
//
//        Shapeutility sha= new Shapeutility();
//        sha.calculateArea(shape1);
//        Predicate<String>isLongString=s->s.length()>10;
//        System.out.println(isLongString.test("hello"));
//        Consumer<String>print= System.out::println;
//        print.accept("hello wprld");
//        Icheck<String>check=(String s)->!s.isEmpty();
//        System.out.println(check.test("mes")

//        List<String>name= Arrays.asList("John","Mesay","Ezekiel","Lemlem");
//        System.out.println("before "+name);
//        name.sort((String a,String b)->a.compareTo( b));
//        System.out.println("after "+name);
//        new Thread(()-> System.out.println("Hello from a thread")).start();

        Set<String>fruit=new HashSet<>();
        fruit.add("Banana");
        fruit.add("cherry");
        fruit.add("apple");
//        System.out.println(fruit);
        boolean isAdd=fruit.add("apple");
//        System.out.println("is apple added +"+isAdd);
        for (String f:fruit){
//            System.out.println(f);
        }
        fruit.remove("apple");
        if(fruit.contains("apple")){
//            System.out.println("it contain apple");
        }
        Set<String> fruitSet=new LinkedHashSet<>();
        fruitSet.add("carrot");
        fruitSet.add("banana");
        fruitSet.add("apple");
        fruitSet.add("dog");
        for(String f:fruitSet){
            System.out.println(f);
        }
    Set<String>treaSet=new TreeSet<>();
        treaSet.add("dog");
        treaSet.add("banana");
        treaSet.add("apple");
        treaSet.add("carrot");

        for(String d : treaSet){
            System.out.println(d);
        }

    }
}
