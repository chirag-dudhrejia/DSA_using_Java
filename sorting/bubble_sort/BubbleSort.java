package sorting.bubble_sort;

public class BubbleSort {
    public void bubblesort(int arr[])
    {
        for (int i=0; i < arr.length-1; i++)
        {
            int sorted = 1;
            for (int j=0; j < arr.length-i-1; j++)
            {
                if (arr[j] > arr[j+1])
                {
                    sorted = 0;
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                    // swap(arr[j], arr[j+1]);
                }
            }

            if (sorted == 1)
            {
                break;
            }
        }
    }

    // void swap(int a, int b)
    // {
    //     a = a + b;
    //     b = a - b;
    //     a = a - b;
    // }
}
