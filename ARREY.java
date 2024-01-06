import java.util.Arrays;
import java.util.Scanner;

public class ArrayProgram {

    public static void insertElements(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double calculateAverage(int[] arr) {
        return (double) calculateSum(arr) / arr.length;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        if (secondMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second maximum element found");
        }
        return secondMax;
    }

    public static int findSecondMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        if (secondMin == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("No second minimum element found");
        }
        return secondMin;
    }

    public static void sortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void sortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
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


        insertValue(arr);
        System.out.print("After insert value : ");
        nprint(arr);


        int sum = sumArray(arr);
        System.out.println("\nSum of array elements: " + sum);


        double avg = calculateAverage(arr);
        System.out.println("Average of array elements: " + avg);


        int max = Max(arr);
        System.out.println("Maximum value in the array: " + max);


        int min = Min(arr);
        System.out.println("Minimum value in the array: " + min);


        try {
            // Finding and printing the second maximum value
            int secondMax = SecondMax(arr);
            System.out.println("Second maximum value in the array: " + secondMax);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            // Finding and printing the second minimum value
            int secondMin = SecondMin(arr);
            System.out.println("Second minimum value in the array: " + secondMin);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        sortAscending(arr);
        System.out.print("asdSorting :");
        nprint(arr);


        sortDescending(arr);
        System.out.print("deSorting :");
        nprint(arr);


    }
}




