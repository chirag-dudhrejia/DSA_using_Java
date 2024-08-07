package sorting.selection_sort;

public class Main {
    public static void main(String arsg[])
    {
        int nums[] = {43, 21, 35, 84, 12, 32, 11, 9, 56, 23};
        // int nums[] = {3, 5, 7, 12, 15, 17, 18, 32, 45, 65, 76};     // Sorted

        // printing array before sorting
        System.out.print("\nBefore Sorting : ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        
        // performing bubble sort
        SelectionSort selection = new SelectionSort();
        selection.selectionsort(nums);
        

        // printing array after sorting
        System.out.print("\nAfter Sorting : ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
