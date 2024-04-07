/*
You are given a 2D integer array logs where each logs[i] = [birthi, deathi] indicates the birth and death years of the ith person.
The population of some year x is the number of people alive during that year.
The ith person is counted in year x's population if x is in the inclusive range [birthi, deathi - 1].
Note that the person is not counted in the year that they die.
Return the earliest year with the maximum population.

Example 1:
Input: logs = [[1993,1999],[2000,2010]]
Output: 1993
Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
Example 2:
Input: logs = [[1950,1961],[1960,1971],[1970,1981]]
Output: 1960
Explanation:
The maximum population is 2, and it had happened in years 1960 and 1970.
The earlier year between them is 1960.
 */

public class MaxPopulationYear {
    public static void main(String[] args) {
        int[][] pop = {{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maxpopulation(pop));
    }
    static int maxpopulation(int[][] popltn){
        int[] arr = new int[101];
        for (int i = 0; i < popltn.length; i++) {
            arr[popltn[i][0] - 1950]++;//incrementing the value at a particular position in an array
            arr[popltn[i][1] - 1950]--;//decrementing the value at a particular position in an array
        }
        //For Running sum 0f an array
        for (int j = 1; j < arr.length; j++) {
            arr[j] += arr[j - 1];
        }
        //Finding the maximum value in an array
        int maxVal = 0;//Initialising the maxvalue
        int maxYr = 0;//Initialising the maxyear
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
                maxYr = i + 1950;
            }
        }
        return maxYr;
    }
}
