package functions_04;

import java.util.HashMap;

public class TwoSumBest {
	
	static int[] findPair(int[] nums , int target){
		HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            Integer res = (target - nums[i]);
            if(hm.containsKey(res))
            {
                int[] ans = {hm.get(res),i};
                return ans;
            }
            else
            {
                hm.put(nums[i],i);
            }
        }
        return null;
    }
	public static void main(String[] args){
		int[] nums = {1,8,2,4};
		int result = 5;
		int[] ans = findPair(nums, result);
		System.out.println(ans[0]+ " "+ans[1]);
	}
}
//Time complexity here is O(N), two for loops are of same length N
//Space Complexity here is O(N) order of N because N elements of array we are storing in Hashmap
//This the best solution for two sum solution
