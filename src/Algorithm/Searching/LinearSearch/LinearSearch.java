package Algorithm.Searching.LinearSearch;


public class LinearSearch {
    public static int linearSearch(int[] arr, int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // إذا وجد العنصر، قم بإرجاع مؤشره
            if (arr[i] == x)
                return i;
        }
        // إذا لم يتم العثور على العنصر، قم بإرجاع -1
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int x = 10;
        int result = linearSearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
