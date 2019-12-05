package tech.avinash;

public class Main {
    public static void main(String[] args) {
        int[] A = {3, 5, 8, 1, 2, 20, 10};

        //MergeSort
        //MergeSortImpl mergeSort = new MergeSortImpl();
        //mergeSort.MergeSort(A , A.length);

        //QuickSort
        QuicksortImpl quicksortImpl = new QuicksortImpl();
        quicksortImpl.Quicksort(A,0,A.length-1);
        printSortedArray(A);
    }

    public static void printSortedArray(int[] A){
        System.out.println("Sorted : ");
        for(int i =0; i< A.length ; i++) {
            if (i != 0)
                System.out.print("-");
            System.out.print(+A[i]);
        }
        System.out.println("");
    }
}
