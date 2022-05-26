package pl.gm.sort;

public class SortTest {
    public static void main(String[] args) {
        int[] numbers = {2,0,4,8,1,77,3,10,15,5};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(numbers);
        bubbleSort.improvedSort(numbers);
        bubbleSort.improvedSort2(numbers);

    }
}
