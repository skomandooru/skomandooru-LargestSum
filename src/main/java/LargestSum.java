
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javafx.print.Collation;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        List<Integer> sumList = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                sumList.add(nums.get(i) + nums.get(j));
            }
        }
        Collections.sort(sumList);
        return sumList.get(sumList.size()-1);
    }

}