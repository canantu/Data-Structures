package AlgorithmicAnalysis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static void main(String[] args) {

        int target = 9;
        int[] array = new int[]{7,4,3,5,2,2,7,9,11};
        System.out.println(Arrays.toString(twoSum(array, target)));


        System.out.println(Arrays.toString(twoSumWithMap(array, target)));
    }

    public static int[] twoSum(int[] array, int target){
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length-i; j++) {
                if (array[i]+array[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static int[] twoSumWithMap(int[] array, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int value = target - array[i];
            if (map.containsKey(value)){
                return new int[]{i, map.get(value)};
            }else{
                map.put(array[i], i);
            }
        }
        return new int[]{};
    }
}
