package behavioral.strategy;

public class Sorter {
    private SortStrategy sorter;

    public Sorter(SortStrategy sorter) {
        this.sorter = sorter;
    }

    public int[] sort(int[] arr){
        return this.sorter.sort(arr);
    }
}
