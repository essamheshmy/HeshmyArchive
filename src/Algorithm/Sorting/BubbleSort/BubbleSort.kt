package Algorithm.Sorting.BubbleSort

/*

شرح خوارزمية الترتيب بالفقاعات (Bubble Sort) في كوتلن مع أمثلة
خوارزمية الترتيب بالفقاعات هي إحدى الخوارزميات البسيطة لترتيب القوائم. تعمل هذه الخوارزمية عن طريق مقارنة عناصر القائمة المجاورة وتبديلها إذا كانت غير مرتبة بالترتيب الصحيح. تتكرر هذه العملية حتى يتم ترتيب القائمة بالكامل.

كيف تعمل خوارزمية الترتيب بالفقاعات؟
المقارنة والتبديل: تبدأ الخوارزمية بمقارنة العنصر الأول بالعنصر الثاني. إذا كان العنصر الأول أكبر من العنصر الثاني، يتم تبديلهما.
التكرار: تتكرر الخطوة الأولى للمقارنة والتبديل لبقية العناصر في القائمة.
التكرارات: تتكرر العملية بأكملها عدة مرات حتى يتم ترتيب القائمة بالكامل. أي عندما لا يتم إجراء أي تبديل في دورة كاملة، فهذا يعني أن القائمة مرتبة.
 */
fun bubbleSort(array: IntArray) {
    val n = array.size
    // Traverse through all array elements
    for (i in 0 until n - 1) {
        // Last i elements are already in place
        for (j in 0 until n - i - 1) {
            // Traverse the array from 0 to n-i-1
            // Swap if the element found is greater
            // than the next element
            if (array[j] > array[j + 1]) {
                // swap
                array[j] and array[j+1]
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
}
/*
شرح الكود:
الدالة bubbleSort: تأخذ مصفوفة من الأعداد الصحيحة كمدخل وتقوم بترتيبها باستخدام خوارزمية الفقاعات.
الحلقتان المتداخلتان: الحلققة الخارجية تتكرر لعدد مرات يساوي طول المصفوفة ناقص واحد، والحلقة الداخلية تتكرر لفحص كل زوج من العناصر المتجاورة وتبديلهما إذا لزم الأمر.
التبديل: إذا كان العنصر الحالي أكبر من العنصر التالي، يتم تبديلهما باستخدام متغير مؤقت.
نقاط مهمة حول خوارزمية الترتيب بالفقاعات:
البساطة: هي واحدة من أبسط خوارزميات الترتيب.
البطء: تعتبر بطيئة نسبيًا مقارنة بخوارزميات الترتيب الأخرى، خاصة للمصفوفات الكبيرة.
أفضل حالة وأسوأ حالة: أفضل حالة هي عندما تكون المصفوفة مرتبة بالفعل، وأسوأ حالة هي عندما تكون المصفوفة مرتبة بترتيب عكسي.
التعليمية: تستخدم بشكل شائع لتوضيح مفهوم خوارزميات الترتيب.
ملاحظات:

كفاءة: على الرغم من بساطتها، فإن خوارزمية الفقاعات ليست الخيار الأفضل لترتيب كميات كبيرة من البيانات. هناك خوارزميات أخرى أكثر كفاءة مثل Merge Sort و Quick Sort.
تحسينات: يمكن إجراء بعض التحسينات على خوارزمية الفقاعات لتسريع عملها، مثل إضافة متغير لمعرفة ما إذا تم إجراء أي تبديلات في دورة كاملة، وإذا لم يتم إجراء أي تبديل، فإن القائمة مرتبة ويمكن إنهاء الخوارزمية.
في الختام:
خوارزمية الترتيب بالفقاعات هي نقطة بداية جيدة لفهم مفهوم خوارزميات الترتيب، ولكنها ليست الخيار الأمثل في معظم الحالات العملية.
 */