package arrays_and_hashing;
/* LeetCode 217. Contains Duplicate
Easy
Companies
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:

Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.

Example 2:

Input: nums = [1,2,3,4]

Output: false

Explanation:

All elements are distinct.

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]

Output: true



Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109 */

public class P1_E_217_Contains_Duplicate {

    /* public static boolean containsDuplicate(int[] nums) {

    Bruteforce approach
    Time :O(n^2)
    Space : O(n)

        int len = nums.length;

        //edge case
        if(len<=1) return false;
        for (int i=0 ;i<len-1;i++){
            int primarynumber = nums[i];
            for(int j=i+1;j<len;j++){
                int secondarynumber= nums[j];

                if(primarynumber==secondarynumber){
                    return true; //Early return [ER]

                }
            }
        }
        return false; // Default return [DR]
    }
*/
    public static boolean containsDuplicatebesttime(int[] nums){

    }

public static void main (String[] args){
        System.out.println(containsDuplicate(new int[] {1,2,3,4,2}));
}
/*

1 9 8 11 21 19 2

for 2
for 2


 */

}
