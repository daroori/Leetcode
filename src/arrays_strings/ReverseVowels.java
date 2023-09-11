package arrays_strings;

public class ReverseVowels {

    public static void main(String[] args) {
        ReverseVowels solution = new ReverseVowels();
        System.out.println(solution.reverseVowels("leetcode"));
    }
    public String reverseVowels(String s) {
        char[] result = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        String match = "aeiouAEIOU";

        while(start < end){
            String currentStart = String.valueOf(result[start]);
            String currentEnd =String.valueOf(result[end]);
            if(match.contains(currentStart) && match.contains(currentEnd)){
                char temp = result[start];
                result[start] = result[end];
                result[end] = temp;
                start++;
                end--;
            }
            else if(!match.contains(currentStart) && match.contains(currentEnd)){
                start++;
            }
            else end--;
        }
        return String.valueOf(result);
    }

}
