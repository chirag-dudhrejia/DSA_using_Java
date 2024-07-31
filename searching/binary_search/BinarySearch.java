package searching.binary_search;

public class BinarySearch {
    int binarysearch(int arr[], int target)
    {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
            {
                return mid;
            }
            else if (arr[mid] > target)
            {
                right = mid;
            }
            else
            {
                left = mid;
            }
        }

        return -1;
    }
}
