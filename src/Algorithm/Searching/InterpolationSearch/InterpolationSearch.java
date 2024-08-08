package Algorithm.Searching.InterpolationSearch;

/*
كيف يعمل البحث بالتداخل؟
التقدير: بدلاً من اختيار منتصف المصفوفة، يتم حساب مؤشر تقريبي للموقع المحتمل للعنصر المطلوب باستخدام الصيغة التالية:

pos = low + [(x-arr[low])*(high-low)] / (arr[high]-arr[low])
حيث:

pos: المؤشر المقدر.
low: المؤشر الأول للمصفوفة.
high: المؤشر الأخير للمصفوفة.
x: العنصر المراد البحث عنه.
arr[low]: قيمة العنصر الأول.
arr[high]: قيمة العنصر الأخير.
المقارنة: يتم مقارنة العنصر الموجود في المؤشر pos مع العنصر المطلوب.

التقسيم:

إذا كان العنصر الموجود أصغر من العنصر المطلوب، يتم ضبط low على pos + 1.
إذا كان العنصر الموجود أكبر من العنصر المطلوب، يتم ضبط high على pos - 1.
إذا كان متساويًا، يتم العثور على العنصر.
التكرار: تتكرر الخطوات من 2 إلى 4 حتى يتم العثور على العنصر أو حتى يصبح low أكبر من high.
 */
public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int pos;

        // Since array is sorted, an element present in array must be in range defined by corner
        while (low <= high && x >= arr[low] && x <= arr[high]) {
            pos = low + (((high - low) / (arr[high] - arr[low])) * (x - arr[low]));

            // Condition of target found
            if (arr[pos] == x)
                return pos;

            // If x is greater, ignore left half
            if (arr[pos] < x)
                low = pos + 1;

                // If x is smaller, ignore right half
            else
                high = pos - 1;
        }
        return -1;
    }
}
