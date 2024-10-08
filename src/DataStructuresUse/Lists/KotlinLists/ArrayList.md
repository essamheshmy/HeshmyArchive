# ArrayList

### ما هي ArrayList؟

في كوتلن، `ArrayList` هي إحدى تنفيذات واجهة `MutableList`، وهي تمثل قائمة مرتبة قابلة للتعديل. تستخدم `ArrayList` داخليًا مصفوفة لتخزين العناصر، مما يجعلها فعالة في عمليات الوصول العشوائي (أي الوصول إلى عنصر معين بمؤشره).

### الخصائص الرئيسية لـ ArrayList:

- **قابلة للتعديل:** يمكنك إضافة عناصر جديدة، حذف عناصر موجودة، وتعديل عناصر قائمة موجودة.
- **مرتبة:** يتم تخزين العناصر بترتيب محدد، ويمكن الوصول إليها باستخدام مؤشرها.
- **ديناميكية:** يمكن لـ `ArrayList` أن تغير حجمها تلقائيًا عند إضافة أو حذف العناصر.
- **فعالة في الوصول العشوائي:** بسبب استخدام المصفوفة الداخلية، فإن الوصول إلى عنصر معين يتم بشكل سريع.

```kotlin
val myList = ArrayList<String>() // قائمة فارغة من نوع سلسلة نصية
val numbers = arrayListOf(1, 2, 3) // قائمة مملوءة بالأعداد

```

### العمليات الأساسية على ArrayList:

```kotlin
//**إضافة عنصر:**
myList.add("apple")
//إزالة عنصر:
myList.remove("apple")
//الحصول على عنصر:
val firstElement = myList[0]
//تغيير عنصر:
myList[1] = "banana"
//الحصول على حجم القائمة:
val size = myList.size

```

```kotlin
fun main() {
    val fruits = arrayListOf("apple", "banana", "cherry")
    
    // إضافة عنصر
    fruits.add("orange")
    
    // حذف العنصر الثاني
    fruits.removeAt(1)
    
    // طباعة القائمة
    for (fruit in fruits) {
        println(fruit)
    }
}

```

### متى تستخدم ArrayList؟

- **عندما تحتاج إلى قائمة قابلة للتعديل.**
- **عندما تحتاج إلى الوصول العشوائي السريع للعناصر.**
- **عندما تتوقع أن يتغير حجم القائمة بشكل متكرر.**
- **عندما لا تحتاج إلى عمليات إدراج أو حذف متكررة من منتصف القائمة.**

### مقارنة بـ LinkedList

- **ArrayList:** فعالة في الوصول العشوائي، ولكن قد تكون بطيئة في الإدراج والحذف من منتصف القائمة.
- **LinkedList:** فعالة في الإدراج والحذف من بداية أو نهاية القائمة، ولكن الوصول العشوائي قد يكون بطيئًا.

### ملاحظات هامة:

- **النوعية:** يجب تحديد نوع العناصر التي ستخزنها القائمة عند إنشائها.
- **الوظائف العليا:** تدعم كوتلن العديد من الوظائف العليا للعمل مع القوائم، مثل `map`, `filter`, `reduce`، والتي تجعل التعامل مع القوائم أكثر مرونة.
- **التحولات:** يمكن تحويل `ArrayList` إلى أنواع أخرى من القوائم أو المجموعات باستخدام الوظائف المناسبة.

### الخلاصة

`ArrayList` هي أداة قوية ومرنة في كوتلن لتخزين وتنظيم مجموعات من العناصر. فهم خصائصها واستخداماتها سيساعدك على كتابة كود أكثر كفاءة وقابلية للقراءة.