class Solution {
    public String solution(String s) {
        
        String[] numbers = s.split(" ");
        
        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[0]);
        
        for (String number: numbers) {
            int num = Integer.parseInt(number);
            
            if (num > max) max = num;
            if (num < min) min = num;
        }
        
        return min + " " + max;
    }
}