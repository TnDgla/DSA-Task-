public class sumOfSubarray {

    //Largest Sum
    public static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }


    //Smallest Sum
    public static int minSubArraySum(int[] arr) {
        int minSoFar = arr[0];
        int currentMin = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMin = Math.min(arr[i], currentMin + arr[i]);
            minSoFar = Math.min(minSoFar, currentMin);
        }

        return minSoFar;
    }


    //Sum of subarray divisible by n
    public static int divisibleSubArraySumByN(int[] arr){
        int n = 2;
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            
            sum += arr[i]/n;

        }
        return sum;

    }

    public static void main(String[] args) {
        int[] arr = {6, 1, -3, 4, 7, 2, 1, -5, 4};
        System.out.println("Maximum subarray sum is " + maxSubArraySum(arr));
        System.out.println("Smallest subarray sum is " + minSubArraySum(arr));
        System.out.println("Divisible subarray sum is " + divisibleSubArraySumByN(arr));
    }

}
