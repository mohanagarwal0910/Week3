package org.example;

public class BinarySearchOccurrences {

    // Function to find the first occurrence of the target element
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;  // Search left half for first occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return first;
    }

    // Function to find the last occurrence of the target element
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last = mid;
                left = mid + 1;  // Search right half for last occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return last;
    }

    // Main function to return both first and last occurrences
    public static int[] findFirstAndLast(int[] arr, int target) {
        int[] result = new int[2];
        result[0] = findFirstOccurrence(arr, target);
        result[1] = findLastOccurrence(arr, target);

        if (result[0] == -1) {
            return new int[]{-1, -1}; // Target not found
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 3, 3, 4, 5};
        int target = 3;

        int[] result = findFirstAndLast(arr, target);

        if (result[0] == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("First occurrence: " + result[0]);
            System.out.println("Last occurrence: " + result[1]);
        }

        target = 6;
        result = findFirstAndLast(arr, target);

        if (result[0] == -1) {
            System.out.println("Element not found");
        }
    }
}

