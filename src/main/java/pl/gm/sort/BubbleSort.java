package pl.gm.sort;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public void improvedSort(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    swap(numbers, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public void improvedSort2(int[] numbers) {
        int i = 0;
        boolean isSwapOccured = true;
        while (isSwapOccured) {
            isSwapOccured = false;
            i++;
        }
        for (int j = 0; j < numbers.length - 1; j++) {
            if (numbers[j] > numbers[j + 1]) {
                swap(numbers, j, j + 1);
                isSwapOccured = true;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
