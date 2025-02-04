package org.example;

import java.util.Arrays;

public class SearchOperations {

    // Function to find the first missing positive integer using Linear Search
    public static int findFirstMissingPositive(int[] arr) {
        int n = arr.length;

        // Step 1: Mark negative numbers and numbers greater than n as n+1 (out of range)
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = n + 1;
            }
        }

        // Step 2: Use the indices to mark the presence of numbers in the array
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num <= n) {
                arr[num - 1] = -Math.abs(arr[num - 1]);
            }
        }

        // Step 3: Find the first index which is not marked (its number is not negative)
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        return n + 1; // If all positive integers from 1 to n are present
    }

    // Function to perform Binary Search and find the index of the target number
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};

        // Find the first missing positive integer
        int firstMissingPositive = findFirstMissingPositive(arr);
        System.out.println("First missing positive integer: " + firstMissingPositive); // Output: 2

        // Sort the array to apply Binary Search
        Arrays.sort(arr);

        // Find the index of a target number using Binary Search
        int target = 4;
        int targetIndex = binarySearch(arr, target);
        if (targetIndex != -1) {
            System.out.println("Index of target " + target + ": " + targetIndex); // Output: 2
        } else {
            System.out.println("Target not found");
        }

        target = 2;
        targetIndex = binarySearch(arr, target);
        if (targetIndex != -1) {
            System.out.println("Index of target " + target + ": " + targetIndex); // Output: 1
        } else {
            System.out.println("Target not found");
        }
    }
}

