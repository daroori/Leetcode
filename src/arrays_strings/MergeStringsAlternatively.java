package arrays_strings;

public class MergeStringsAlternatively {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder mergerWord =new StringBuilder();
        String wordLength = word1 + word2;

        for(int i=0;i<wordLength.length();i++) {
            if(i< word1.length())
                mergerWord.append(word1.charAt(i));
            if (i < word2.length()){
                mergerWord.append(word2.charAt(i));
            }
        }
        return String.valueOf(mergerWord);
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("ab","cdef"));;
    }
}
