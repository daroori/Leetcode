package arrays_strings;

import java.util.ArrayList;
import java.util.List;

public class GreatestNumberCandies {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> greatest = new ArrayList<>();
        int greatestNum = 0;
        for (int candy : candies) {
            if (candy > greatestNum) {
                greatestNum = candy;
            }
        }
        for (int i = 0;i<candies.length;i++){
            greatest.add(i, false);
        }
        for (int i = 0;i<candies.length;i++){
            if(candies[i] + extraCandies >= greatestNum){
                greatest.set(i, true);
            }
        }

        return greatest;
    }

    public static void main(String[] args) {
        int[] candy = {4,2,1,1,2};
        System.out.println(kidsWithCandies(candy,1));
    }
}
