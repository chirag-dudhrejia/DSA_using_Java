package searching.binary_search;

public class Main {
    public static void main(String args[])
    {
        int nums[] = {3, 93, 5, 21, 7, 2, 9, 11, 32, 73};
        // int nums[] = {3, 5, 7, 9, 11, 32, 46, 73};         // sorted
        int target = 3;

        // sorting array using bubble sort
        BubbleSort bubble = new BubbleSort();
        bubble.bubblesort(nums);

        // printing sorted array
        System.out.print("Sorted Array : ");
        for (int i : nums) {
            System.out.print(i + " ");
        }

        // performing binary search
        BinarySearch bs = new BinarySearch();
        int result = bs.binarysearch(nums, target);

        if (result == -1)
        {
            System.out.println("\n" + "Element not found.");
        }
        else
        {
            System.out.println("\nElement " + target +  " is present at Index : " + result);
        }
    }
}
