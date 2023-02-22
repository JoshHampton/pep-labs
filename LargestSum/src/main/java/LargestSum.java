
import java.util.ArrayList;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        int bigS = 0;
        int i, j;

        for (i = 0; i < nums.size()-1; i++){
            for (j = i+1; j <= nums.size()-1; j++){
                if((nums.get(i) + nums.get(j)) > bigS){
                    bigS = nums.get(i) + nums.get(j);
                }
            }
        }
        return bigS;
    }
}