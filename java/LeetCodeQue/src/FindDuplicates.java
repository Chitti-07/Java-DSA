public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 4, 2};
        System.out.println(sort(arr));
    }

    static int sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];

            if (arr[i] != i + 1){
                if (arr[i] != arr[correct]){
                    //element at current index is not equal to ele at correct ind
                    swap(arr,i,correct);
                    //swap the ele
                }else {
                    return arr[i];
                }
            }else {
                i++;
            }

        }
        return -1;
    }

    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
