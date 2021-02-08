package assignment2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args){
        System.out.println("Welcome to the Sorting method lab");
        System.out.println("Author: Brendan Robert");
        System.out.println("Using the bubble sort");
        Scanner scan = new Scanner(System.in);
        int size = 0;
        int minVal = 0;
        int maxVal = 0;
        try{
            System.out.print("Enter the size of your collection: ");
            size = Integer.parseInt(scan.next());
            System.out.print("Enter the minimum  value: ");
            minVal = Integer.parseInt(scan.next());
            System.out.print("Enter the maximum inclusive value: ");
            maxVal = Integer.parseInt(scan.next());
        }catch(Exception e){
            System.err.println("Invalid input try again.");
            e.printStackTrace();
        }
        int[] arr = generateWithRandomValues(size, minVal, maxVal);
        System.out.println("The values are: " + Arrays.toString(arr));
        int[] shortCircuitSorted = shortCircuitBubbleSort(arr);
        System.out.println("Short circuit sorted: " + Arrays.toString(shortCircuitSorted) + "\n");
        int[] bubbleSort = bubbleSort(arr);
        System.out.println("All values compared sorted: " + Arrays.toString(bubbleSort));

    }
    public static int[] generateWithRandomValues(int size, int min, int max){
        int[] x = new int[size];
        for(int i = 0; i < size; i++ ){
            int value = ThreadLocalRandom.current().nextInt(min, max + 1);
            x[i] = value;
        }
        return x;
    }
    public static int[] shortCircuitBubbleSort(int[] original){
        int[] arr = original.clone();
        int n = arr.length;
        int comparisons = 0;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    comparisons++;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
            System.out.println("Run time with short circuiting: " + comparisons);
        return arr;
    }

    public static int[] bubbleSort(int[] original){
        int[] arr = original.clone();
        int n = arr.length;
        int comparisons = 0;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                comparisons++;
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Run time with all elements compared: " + comparisons);
        return arr;
    }
}
