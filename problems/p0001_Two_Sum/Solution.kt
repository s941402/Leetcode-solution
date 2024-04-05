package problems.p0001_Two_Sum

// solution1 - slide window: O(N^2)
class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
       var start = 0
        var end = 1
        while(start <= end && end < nums.size){
          if(nums[start] + nums[end] == target){
              return intArrayOf(start,end)
          }else if(end == nums.size - 1){
              start++
              end = start + 1
          }else{
              end++
          }
        }
        return intArrayOf(start,end)
    }
}