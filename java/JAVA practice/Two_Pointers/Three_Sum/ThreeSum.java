package Two_Pointers.Three_Sum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    // Time Complexity: 
    // Space Complexity: 
//     public static List<List<Integer>> threeSum(int[] nums) {
//     Set<List<Integer>> resultSet = new HashSet<>();

//     for (int i = 0; i < nums.length; i++) {
//         for (int j = i + 1; j < nums.length; j++) {
//             for (int k = j + 1; k < nums.length; k++) {
//                 if (nums[i] + nums[j] + nums[k] == 0) {
//                     List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
//                     Collections.sort(temp);
//                     resultSet.add(temp);
//                 }
//             }
//         }
//     }
//     return new ArrayList<>(resultSet);
// }


    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                
            }
        }
        return 
    }

}
