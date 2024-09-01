package CollectionsReview;

import java.util.*;

public class ArrayListReview {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Jack"));
        students.add(new Student(2, "Julia"));
        students.add(new Student(3, "Mike"));
        students.add(new Student(4, "Marie"));

        // 1. for loop
        System.out.println("Printing with legacy for-loop...");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        // 2. Iterator
        // Forward
        System.out.println("printing with iterator forwards");
        Iterator iter = students.listIterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        // Backward
        System.out.println("printing with iterator backwards");
        while (((ListIterator<?>) iter).hasPrevious()){
            System.out.println(((ListIterator<?>) iter).hasPrevious());
        }

        // 3. For each loop
        System.out.println("printing with for each loop");
        for (Student student:students){
            System.out.println(student);
        }

        // 4. Lambda
        students.forEach(student -> System.out.println(student));

        // Sorting
        Collections.sort(students, new sortByIdDesc());
        students.forEach(student -> System.out.println(student));


        Collections.sort(students, new sortByNameDesc());
        students.forEach(student -> System.out.println(student));


    }


    // implementation of Comparator
    static class sortByIdDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student>{

        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
