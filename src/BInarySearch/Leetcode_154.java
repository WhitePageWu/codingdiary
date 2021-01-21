package BInarySearch;

/**
 * 寻找旋转排序数组中的最小值 II
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 *
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 *
 * 请找出其中最小的元素。
 *
 * 注意数组中可能存在重复的元素。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * */
public class Leetcode_154 {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,1,3}));
    }
    public static int findMin(int[] nums) {
        int n = nums.length;
        int left =0,right=n-1;
        while (left<right){
            int mid = left+((right-left)>>1);
            if (nums[mid]<nums[right]){
                right=mid;
            }else if (nums[mid]>nums[right]){
                left=mid+1;
            }else{
                right--;
            }
        }
        return nums[left];
    }
}
