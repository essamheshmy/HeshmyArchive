package Algorithm.Sorting.MergeSort;

public class MergeSort {

    // دالة لدمج جزئين مرتبين من المصفوفة
    void merge(int arr[], int l, int m, int r)
    {
        // أحسب أحجام الأجزاء الفرعية
        int n1 = m - l + 1;
        int n2 = r - m;

        /* قم بإنشاء مصفوفات مؤقتة */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /* نسخ البيانات إلى المصفوفات المؤقتة */
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* دمج المصفوفتين المؤقتتين */
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* نسخ العناصر المتبقية، إذا وجدت */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // دالة لتنفيذ الـ Merge Sort
    void sort(int arr[], int l, int r)
    {
        if (l < r) {
            // احسب منتصف النطاق
            int m = l + (r - l) / 2;

            // قم بترتيب النصفين بشكل منفصل
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // دمج النصفين المرتبين
            merge(arr, l, m, r);
        }
    }

    // دالة مساعدة لطباعة المصفوفة
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}
