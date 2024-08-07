package sorting.selection_sort;

public class SelectionSort {
    public void selectionsort(int arr[])
    {
        for (int i=0; i < arr.length-1; i++)
        {
            int minindex = i;

            for (int j=i+1; j < arr.length; j++)
            {
                if (arr[j] < arr[minindex])
                {
                    minindex = j;
                }
            }
            
            if (minindex != i)
            {
                arr[i] = arr[i] + arr[minindex];
                arr[minindex] = arr[i] - arr[minindex];
                arr[i] = arr[i] - arr[minindex];
            }
        }
    }
}
