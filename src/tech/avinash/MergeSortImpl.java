package tech.avinash;

/**
 * One of the famous Divide and Conquer Algorithms
 * Space Complexity ->Big O(n)
 * Time Complexity-> Big O(n log(n)) ,  in worst case . Better than most sorting algorithms.
 */
public class MergeSortImpl {
    public void MergeSort(int[] A , int n) {
        //base condition
        if (n < 2) // only one element left in array , Time to merge now
            return;

        int mid = n / 2;
        //Partition into 2 arrays
        int[] leftArray = new int[mid];
        int[] rightArray = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            leftArray[i] = A[i];
        }
        for (int i = mid ; i < n; i++) {
            rightArray[i-mid] = A[i];
        }

        //DIVIDE - Partition the elements into arrays until no further division is possible
        MergeSort(leftArray , mid); //first half
        MergeSort(rightArray , n- mid); //second half

        //CONQUER -- Merge the 2 arrays
        Merge(A,mid, leftArray,n-mid, rightArray);//Merge the 2 halves created above
    }

    //There are 2 arrays available now. Merge them selecting the least in both the arrays
    private void Merge(int[] A, int leftLength, int[] leftArray,int rightLength, int[] rightArray) {

        int i = 0;
        int j = 0;
        int k = 0;

        //Find least of the 2 arrays and assemble them in array A
        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                A[k] = leftArray[i];
                i++;
            } else {
                A[k] = rightArray[j];
                j++;
            }
            k++;
        }

        //left array might have more , simply copy them to A
        while (i < leftLength) {
            A[k] = leftArray[i];
            k++;
            i++;
        }
        //right array might have more , simply copy them to A
        while (j < rightLength) {
            A[k] = rightArray[j];
            k++;
            j++;
        }
    }
}