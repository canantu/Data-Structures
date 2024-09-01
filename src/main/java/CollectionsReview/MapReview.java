package CollectionsReview;

import java.util.HashMap;
import java.util.Map;

public class MapReview {

    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();

        studentsMap.put(1, "Mary");
        studentsMap.put(2, "Jane");
        studentsMap.put(3, "Mike");
        studentsMap.put(4, "John");

        System.out.println(studentsMap);
        System.out.println(studentsMap.get(1));

        System.out.println(findFirstNonRepeatingChar("JJavaDeveloper"));
    }

    public static Character findFirstNonRepeatingChar(String str){

        int count = 0;
        Map<Character, Integer> map = new HashMap<>();  // space complexity O(n)
        for (Character ch:str.toCharArray()){   // time complexity O(n
            if (map.containsKey(ch)){
                count = map.get(ch);
                map.put(ch, count+1);
            }else {
                map.put(ch, 1);
            }
        }
        for (Character ch:str.toCharArray()){  // time complexity O(n
            if (map.get(ch) == 1) return ch;
        }
        return null;
    }
}
