package CollectionsReview;

import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        Set<Student> set = new HashSet<>();  // LinkedHashSet keeps inserting order

        set.add(new Student(1, "Jack"));
        set.add(new Student(2, "Julia"));
        set.add(new Student(3, "Mike"));
        set.add(new Student(4, "Marie"));

        System.out.println(set);


        set.add(new Student(4, "Marie")); // will not be added

        System.out.println(findFirstRepeatingCharInCharArray("Java Developer"));
    }

    public static Character findFirstRepeatingCharInCharArray(String str) {
        Set<Character> chars = new HashSet<>();  // space complexity O(n)
        // a new data structure is created and causes space complexity

        for (Character ch : str.toCharArray()) if (!chars.add(ch)) return ch;
        return null;
        // time complexity : O(n)

    }

}
