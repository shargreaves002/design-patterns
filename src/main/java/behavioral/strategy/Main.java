package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 7, 3, 6, 8};
        Sorter sorter = new Sorter(new BubbleSortStrategy());
        sorter.sort(arr);
        sorter = new Sorter(new QuickSortingStrategy());
        sorter.sort(arr);
    }
}
