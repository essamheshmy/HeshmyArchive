# InterpolationSearch

### ما هو البحث بالتداخل؟

البحث بالتداخل هو تحسين للبحث الثنائي، حيث يستغل المعلومات الإضافية عن توزيع البيانات في المصفوفة لتحديد موقع العنصر المطلوب بشكل أكثر دقة. بدلاً من تقسيم المصفوفة إلى نصفين في كل تكرار، يقوم البحث بالتداخل بتقدير موقع العنصر المطلوب بناءً على قيمته وقيم العناصر في بداية ونهاية المصفوفة.

### متى نستخدم البحث بالتداخل؟

- **مصفوفات مرتبة بشكل منتظم:** عندما تكون البيانات في المصفوفة موزعة بشكل منتظم تقريبًا (مثل الأعداد الصحيحة المتتالية).
- **عندما يكون البحث الثنائي بطيئًا:** إذا كان البحث الثنائي لا يوفر الأداء المطلوب، يمكن تجربة البحث بالتداخل.

### مثال في جافا:

```java
public class InterpolationSearch {
    public static int interpolationSearch(int arr[], int lo, int hi, int x) {
        int pos;
        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {
            pos = lo + (((hi - lo) / (arr[hi] - arr[lo])) * (x - arr[lo]));

            if (arr[pos] == x)
                return pos;
            if (arr[pos] < x)
                return interpolationSearch(arr, pos + 1, hi, x);
            else
                return interpolationSearch(arr, lo, pos - 1, x);
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 4, 10, 40};
        int n = arr.length;
        int x = 10;
        int index = interpolationSearch(arr, 0, n - 1, x);

        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not present");
    }
}

```

مثال في كوتلن:

```java
fun interpolationSearch(arr: IntArray, lo: Int, hi: Int, x: Int): Int {
    if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {
        val pos = lo + (((hi - lo) / (arr[hi] - arr[lo])) * (x - arr[lo]))

        return when {
            arr[pos] == x -> pos
            arr[pos] < x -> interpolationSearch(arr, pos + 1, hi, x)
            else -> interpolationSearch(arr, lo, pos - 1, x)
        }
    }
    return -1
}

fun main() {
    val arr = intArrayOf(2, 3, 4, 10, 40)
    val n = arr.size
    val x = 10
    val index = interpolationSearch(arr, 0, n - 1, x)

    if (index != -1)
        println("Element found at index $index")
    else
        println("Element not present")
}
```

### شرح الكود:

- **حساب الموضع المتوقع:** يتم حساب موضع تقريبي للعنصر المطلوب بناءً على قيمته وقيم العناصر في بداية ونهاية المصفوفة.
- **المقارنة والتكرار:** يتم مقارنة العنصر في الموضع المحسوب بالعنصر المطلوب، وإذا لم يتطابق، يتم تكرار العملية على النصف المناسب من المصفوفة.

### ملاحظات:

- **أداء أفضل:** البحث بالتداخل عادة ما يكون أسرع من البحث الثنائي عندما تكون البيانات موزعة بشكل منتظم.
- **حالة أسوأ:** في أسوأ الحالات، يمكن أن يكون أداء البحث بالتداخل أسوأ من البحث الثنائي.
- **تطبيق محدود:** لا ينصح باستخدام البحث بالتداخل في جميع الحالات، حيث يجب أن تكون البيانات موزعة بشكل مناسب لتحقيق فوائد هذا النوع من البحث.

**ملخص:**
البحث بالتداخل هو تقنية بحث فعالة عندما تكون البيانات موزعة بشكل منتظم. يستغل هذه الخاصية لتحديد موقع العنصر المطلوب بشكل أسرع من البحث الثنائي. ومع ذلك، يجب توخي الحذر عند استخدامه، حيث قد لا يكون فعالًا في جميع الحالات.