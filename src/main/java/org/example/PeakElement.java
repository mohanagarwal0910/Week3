package org.example;

public class PeakElement {
    public static int findPeakElement(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is a peak element
            if ((mid == 0 || arr[mid] > arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] > arr[mid + 1])) {
                return arr[mid]; // Return the peak element
            }

            // If left neighbor is greater, move left
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                right = mid - 1;
            } else { // Else move right
                left = mid + 1;
            }
        }
        return -1; // Should never reach here for a valid input
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};
        int peak = findPeakElement(arr);
        System.out.println("Peak Element: " + peak);
    }
}

