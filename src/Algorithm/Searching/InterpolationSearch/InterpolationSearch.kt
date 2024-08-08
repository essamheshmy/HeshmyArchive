package Algorithm.Searching.InterpolationSearch

fun interpolationSearch(arr: IntArray, x: Int): Int {
    var low = 0
    var high = arr.size - 1

    while (low <= high && x >= arr[low] && x <= arr[high]) {
        val pos = low + ((x - arr[low]) * (high - low)) / (arr[high] - arr[low])

        if (arr[pos] == x)
            return pos

        if (arr[pos] < x)
            low = pos + 1
        else
            high = pos - 1
    }

    return -1
}
/*
شرح الكود:
الدالة interpolationSearch: تأخذ مصفوفة مرتبة من الأعداد الصحيحة arr والعنصر المراد البحث عنه x كمدخلات، وتعيد مؤشر العنصر إذا وجد، وإلا تعيد -1.
المتغيرات low و high: تمثل مؤشرات بداية ونهاية النطاق الذي نبحث فيه.
الحلقة while: تستمر الحلقة حتى نجد العنصر أو حتى يصبح النطاق فارغًا.
حساب المؤشر التقريبي pos: يتم حساب المؤشر التقريبي باستخدام الصيغة التي شرحناها سابقًا.
المقارنة: نقارن بين قيمة العنصر في المؤشر المحسوب arr[pos] والعنصر المطلوب x.
إذا كانت متساوية: وجدنا العنصر ونعيد المؤشر.
إذا كان العنصر المطلوب أكبر: نعيد تكرار البحث في النصف الأيمن من المصفوفة.
إذا كان العنصر المطلوب أصغر: نعيد تكرار البحث في النصف الأيسر من المصفوفة.
 */