package sorting.insertion_sort;

public class Main {
    public static void main(String args[])
    {
        int nums[] = {43, 21, 35, 84, 12, 32, 11, 9, 56, 23};

        // printing array before sorting
        System.out.print("\nBefore Sorting : ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        
        // performing bubble sort
        InsertionSort insertion = new InsertionSort();
        insertion.insertionsort(nums);
        

        // printing array after sorting
        System.out.print("\nAfter Sorting : ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
