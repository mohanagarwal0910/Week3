package org.example;

public class MatrixSearch {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int numRows = matrix.length;
        int numColumns = matrix[0].length;

        int left = 0;
        int right = numRows * numColumns - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Convert mid to row and column
            int row = mid / numColumns;
            int col = mid % numColumns;

            // Compare the middle element with the target
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };

        int target = 5;

        System.out.println(searchMatrix(matrix, target)); // Output: true

        target = 20;
        System.out.println(searchMatrix(matrix, target)); // Output: false
    }
}

