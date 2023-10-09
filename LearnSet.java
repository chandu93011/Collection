import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

    public static void main(String[] args) {

      //  Set<Integer> set=new TreeSet<>();

//        //In tree set it will be sorted and it will be unique
//
//        set.add(32);
//        set.add(45);
//        set.add(34);
//        set.add(56);
//        set.add(67);
//        //set.add(45);
//        set.remove(45);
//        System.out.println(set.contains(45)); //false
//        System.out.println(set);
//        System.out.println(set.isEmpty());
//        System.out.println(set.size());

        Set<Student> students=new HashSet<>();
        students.add((new Student("Chandan",191355)));
        students.add((new Student("Aditya",191355)));
        students.add((new Student("Ashutosh",191376)));

        System.out.println(students);
    }
}
