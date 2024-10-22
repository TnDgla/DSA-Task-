// Maximize a condition:-
// When the goal is to maximize a condition, typically aim to find the subarray that yields the maximum value based on a  
// certain operation like sum ,product, value.


// Minimize a condition:-
// When the goal is to minimize a condition, you are looking for the subarray that results in the smallest possible value.

public class MaxMinArray {
    public static void findMaxMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }

    public static void main(String[] args) {
        int[] arr = {15, 22, 8, 19, -3, 7, 1, 99, -10, 56};
        findMaxMin(arr);
    }
}

// Yes, the problem allows for both negative and positive numbers.

// The program I provided handles both negative and positive values correctly. It doesn't matter if the array contains negative numbers,
// positive numbers, or a mix of both. The algorithm will still correctly find the maximum and minimum values by comparing each element
// with the current maximum and minimum values.
