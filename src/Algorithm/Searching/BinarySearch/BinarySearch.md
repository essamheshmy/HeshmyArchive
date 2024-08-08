# BinarySearch

البحث الثنائي هو خوارزمية بحث فعالة تستخدم للعثور على عنصر معين داخل مصفوفة مرتبة. بدلاً من البحث عن العنصر عن طريق فحص كل عنصر على حدة، يقوم البحث الثنائي بتقسيم المصفوفة إلى نصفين في كل تكرار، ويقارن العنصر المطلوب بقيمة العنصر في المنتصف. إذا كان العنصر المطلوب أكبر، يتم تكرار العملية على النصف الأيمن من المصفوفة، وإذا كان أصغر، يتم تكرارها على النصف الأيسر. تستمر هذه العملية حتى يتم العثور على العنصر أو حتى يتم استنفاد جميع الاحتمالات.

### لماذا نستخدم البحث الثنائي؟

- **سرعة:** البحث الثنائي أسرع بكثير من البحث الخطي، خاصة للمصفوفات الكبيرة.
- **كفاءة:** يقلل من عدد المقارنات اللازمة للعثور على العنصر.

مثال في جافا:

```java
public class BinarySearch {
    public static int binarySearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x)
                return m;
            if (arr[m] < x)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = binarySearch(arr, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}

```

مثال في كوتلن:

```kotlin
fun binarySearch(arr: IntArray, x: Int): Int {
    var left = 0
    var right = arr.size - 1
    while (left <= right) {
        val mid = left + (right - left) / 2
        when {
            arr[mid] == x -> return mid
            arr[mid] < x -> left = mid + 1
            else -> right = mid - 1
        }
    }
    return -1
}

fun main() {
    val arr = intArrayOf(2, 3, 4, 10, 40)
    val x = 10
    val result = binarySearch(arr, x)
    if (result == -1)
        println("Element not present")
    else
        println("Element found at index $result")
}

```

### شرح الكود:

1. **تحديد حدود البحث:** يتم تخزين المؤشرات `left` و `right` لتمثيل الحد الأدنى والأقصى للمصفوفة على التوالي.
2. **حساب منتصف المصفوفة:** يتم حساب المؤشر الأوسط `mid` في كل تكرار.
3. **المقارنة:** يتم مقارنة العنصر في المنتصف `arr[mid]` بالعنصر المطلوب `x`.
4. **تعديل الحدود:**
    - إذا كان `arr[mid]` يساوي `x`، فقد تم العثور على العنصر، ويتم إرجاع المؤشر.
    - إذا كان `arr[mid]` أصغر من `x`، فإن العنصر المطلوب (إذا وجد) يجب أن يكون في النصف الأيمن من المصفوفة، لذلك يتم تحديث `left` إلى `mid + 1`.
    - إذا كان `arr[mid]` أكبر من `x`، فإن العنصر المطلوب (إذا وجد) يجب أن يكون في النصف الأيسر من المصفوفة، لذلك يتم تحديث `right` إلى `mid - 1`.
5. **التكرار:** تستمر العملية حتى يتم العثور على العنصر أو حتى يصبح `left` أكبر من `right`.

**ملاحظات:**

- يجب أن تكون المصفوفة مرتبة لكي يعمل البحث الثنائي بشكل صحيح.
- إذا لم يتم العثور على العنصر، يتم إرجاع -1.
- كوتلن توفر طريقة أكثر إيجازًا باستخدام `when` للتعبير عن الشروط.