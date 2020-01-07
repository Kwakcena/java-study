package pratice;

public class QuickSort implements Sort {
    @Override
    public void ascending(int[] arr) {
        System.out.println("Quick Sort ascending");
    }

    @Override
    public void descending(int[] arr) {
        System.out.println("Quick Sort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("QuickSort입니다.");
    }
}
