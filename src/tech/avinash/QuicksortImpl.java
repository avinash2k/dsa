package tech.avinash;

/**
 * Quick Sort
 * Time Complexity :
 * O(n log(n)) - Average case running time
 * O(n2 ) - Worst case running time
 */
public class QuicksortImpl {
    private int Partition(int[] A , int start , int end){
        int partitionIndex = start;
        int pivot = end;
        //compare an element with pivot and swap it with partitionIndex if its smaller
        for(int i = start ; i< end; i++){
            if(A[i] <= A[pivot]){
                Swap(A,  i, partitionIndex);
                partitionIndex++;
            }
        }
        //Swap the partition index as now everything left to the partition index is less than the pivot
        Swap(A,partitionIndex, pivot);
        //After swap the value at pivot will be in place of partitionIndex
        return partitionIndex;
    }

    public void Quicksort(int[] A , int start, int end){
        if(start < end) {
            //Start < End in following case
            //Only one element left
            int pIndex = Partition(A, start, end);
            Quicksort(A, start, pIndex - 1);
            Quicksort(A, pIndex + 1, end);
        }
    }

    private void Swap(int[]A, int index1, int index2){
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }
}
