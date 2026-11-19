class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxShort = 0;
        int maxLong = 0;
        
        for(int i=0; i < sizes.length; i++) {
            int shortSide = Math.min(sizes[i][0], sizes[i][1]);
            int longSide = Math.max(sizes[i][0], sizes[i][1]);
            
            maxShort = Math.max(maxShort, shortSide);
            maxLong = Math.max(maxLong, longSide);
        } 
        
        answer = maxShort * maxLong;
        
        return answer;
    }
}