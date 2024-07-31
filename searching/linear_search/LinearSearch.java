package searching.linear_search;

public class LinearSearch
{
    public static void main(String args[])
    {
        int nums[] = {3, 93, 5, 21, 7, 2, 9, 11, 32, 73};
        int target = 93;

        System.out.println(linearsearch(nums, target));
    }

    static int linearsearch(int arr[], int target)
    {
        for (int i=0; i < arr.length; i++) {
            if (arr[i] == target)
            {
                return i;
            }
        }

        return -1;
    }
}