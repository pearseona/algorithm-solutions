import java.util.*;

class Solution {
    
    
    public int solution(int[] nums) {
        
        int answer;
        
        HashSet<Integer> types = new HashSet<>();
        
        for (int i=0; i < nums.length; i++) {
            types.add(nums[i]);
        }
        
        if (types.size() > nums.length / 2)
            answer = nums.length / 2;
        else
            answer = types.size();
        
        return answer;
    }
}