class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int fal = nums1.length;         
    int sal = nums2.length;   
    int[] result = new int[fal + sal]; 
    System.arraycopy(nums1, 0, result, 0, fal);  
    System.arraycopy(nums2, 0, result, fal, sal); 
        int n= fal+sal;
     Arrays.sort(result);
	if (result.length % 2 == 1) {
            return result[result.length / 2];
        } else {
            return (double) (result[result.length / 2] + result[(result.length / 2) - 1]) / 2;
        }
 }
    
}
