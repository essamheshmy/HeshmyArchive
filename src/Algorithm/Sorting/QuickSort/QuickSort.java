package Algorithm.Sorting.QuickSort;

public class QuickSort {

    // دالة لتقسيم المصفوفة حول العنصر المحوري
    static int partition(int array[], int low, int high) {
        int pivot = array[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // إذا كان العنصر الحالي أصغر أو يساوي العنصر المحوري
            if (array[j] <= pivot) {
                i++;
                // تبادل العناصر
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // وضع العنصر المحوري في مكانه الصحيح
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // دالة لتنفيذ الترتيب السريع
    static void quickSort(int array[], int low, int high) {
        if (low < high) {
            /* pi هو مؤشر تقسيم،
              array[p] الآن في مكانه الصحيح */
            int pi = partition(array, low, high);

            // ترتيب الأجزاء الفرعية بشكل منفصل
            quickSort(array, low, pi - 1);
            quickSort(array, pi + 1, high);
        }
    }

    // دالة لطباعة المصفوفة
    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


}
