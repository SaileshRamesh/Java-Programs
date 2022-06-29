package arrays_05;

public class Sample {
	public static int rob(int[] nums) {
		if(nums.length == 2){ 
			return Math.max(nums[0], nums[1]);
		}else{
          int sum = nums[0];
          for(int i = 1 ; i < nums.length ; i++){
            if(i % 2 != 0){
                sum += nums[i];
            }
          }
          return sum;
		} 
    }
	public static void main(String[] args) {
		int[] arr = new int[]{1,2};
		System.out.println(rob(arr));
	}
}
