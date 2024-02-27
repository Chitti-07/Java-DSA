import java.util.*;

public class Kids_With_the_Greatest_Number_of_Candies {

//    There are n kids with candies. You are given an integer array candies,
//    where each candies[i] represents the number of candies the ith kid has,
//    and an integer extraCandies, denoting the number of extra candies that you have.
//    Return a boolean array result of length n, where result[i] is true if,
//    after giving the ith kid all the extraCandies,
//    they will have the greatest number of candies among all the kids, or false otherwise.
//    Note that multiple kids can have the greatest number of candies.
//
//            Example 1:
//    Input: candies = [2,3,5,1,3], extraCandies = 3
//    Output: [true,true,true,false,true]
//    Explanation: If you give all extraCandies to:
//- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
//- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
//- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
//- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
//- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.


    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        for(int candy : candies){//to get the maximum value in an array
            if(candy > max) {
                max = candy;
            }
        }
        List<Boolean> res = new ArrayList<>();
        for(int candy : candies){//adding extra to ele in array and compare it with max
            res.add(candy + extraCandies >= max);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,1,4,5};
        int extra = 3;
        System.out.println(kidsWithCandies(arr,extra));
    }
}
