package pratice;

import java.io.IOException;

public class SortTest {
    public static void main(String[] args) throws IOException {
        Sort sort = null;
        System.out.println("정렬방식을 선택하세요.");
        System.out.println("B : Bubble Sort");
        System.out.println("H : Heap Sort");
        System.out.println("Q : Quick Sort");

        int ch = System.in.read();

        if(ch == 'B' || ch == 'b') {
            sort = new BubbleSort();
        }
        else if(ch == 'H' || ch == 'h') {
            sort = new HeapSort();
        }
        else if(ch == 'Q' || ch == 'q') {
            sort = new QuickSort();
        }
        else {
            System.out.println("지원하지않는 정렬입니다.");
        }

        int[] arr = {1,2,3,4,5};
        sort.ascending(arr);
        sort.descending(arr);
        sort.description();


    }
}
