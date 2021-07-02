class Solution {
    public int[] twoSum(int[] nums, int target) {
         HashMap<Integer,Integer> ha=new HashMap<>();
    int[] arr=new int[2];
    
    for(int i=0; i<nums.length; i++)
    {
        if(ha.containsKey(target-nums[i]))
        {
            arr[0]=ha.get(target-nums[i]);
            arr[1]=i;
            break;
        }
        else
        {
            ha.put(nums[i],i);
        }
    }
    return arr;

    }
}
