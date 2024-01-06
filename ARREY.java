package Array;


import java.util.Scanner;


public class Eightmethod {
    public static void nprint(int x[]) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }


    public static void insertValue(int x[]) { // Corrected method name
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < x.length; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            x[i] = scan.nextInt();
        }
    }


    public static int sumArray(int x[]) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }


    public static double calculateAverage(int x[]) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return (double) sum / x.length;
    }


    public static int Max(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }


        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    public static int Min(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }


        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


    public static int SecondMax(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements");
        }


        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;


        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i] != max) {
                secondMax = array[i];
            }
        }


        if (secondMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second maximum element found");
        }


        return secondMax;
    }


    public static int SecondMin(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements");
        }


        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;


        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                secondMin = min;
                min = array[i];
            } else if (array[i] < secondMin && array[i] != min) {
                secondMin = array[i];
            }
        }


        if (secondMin == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("No second minimum element found");
        }


        return secondMin;
    }


    public static void asdSorting(int A1[]) {
        int n = A1.length;
        for (int i = 0; i < n - 1; i++) {
            for (int x = 0; x < n - i - 1; x++) {
                if (A1[x] > A1[x + 1]) {
                    int temp = A1[x];
                    A1[x] = A1[x + 1];
                    A1[x + 1] = temp;
                }
            }
        }
    }


    public static void deSorting(int A1[]) {
        int n = A1.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (A1[j] < A1[j + 1]) {
                    int temp = A1[j];
                    A1[j] = A1[j + 1];
                    A1[j + 1] = temp;
                }
            }


        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = scan.nextInt();
        int[] x = new int[size];
        System.out.println("Before insert value : ");
        nprint(x);


        insertValue(x);
        System.out.print("After insert value : ");
        nprint(x);


        int sum = sumArray(x);
        System.out.println("\nSum of array elements: " + sum);


        double avg = calculateAverage(x);
        System.out.println("Average of array elements: " + avg);


        int max = Max(x);
        System.out.println("Maximum value in the array: " + max);


        int min = Min(x);
        System.out.println("Minimum value in the array: " + min);


        try {
            // Finding and printing the second maximum value
            int secondMax = SecondMax(x);
            System.out.println("Second maximum value in the array: " + secondMax);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            // Finding and printing the second minimum value
            int secondMin = SecondMin(x);
            System.out.println("Second minimum value in the array: " + secondMin);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        asdSorting(x);
        System.out.print("asdSorting :");
        nprint(x);


        deSorting(x);
        System.out.print("deSorting :");
        nprint(x);


    }
}




