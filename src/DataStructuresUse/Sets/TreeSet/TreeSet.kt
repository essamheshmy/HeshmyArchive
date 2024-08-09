package DataStructuresUse.Sets.TreeSet

import java.util.TreeSet

fun _TreeSet(){
// إنشاء TreeSet من الأعداد الصحيحة (ترتيب تصاعدي افتراضي)
    val numbers = TreeSet<Int>()

// إضافة عناصر
    numbers.add(30)
    numbers.add(10)
    numbers.add(20)
    numbers.add(20) // لن يتم إضافته لأن 20 موجود بالفعل

// طباعة العناصر (ستكون مرتبة تصاعديًا)
    println(numbers) // يطبع [10, 20, 30]



    //ترتيب مخصص
    //يمكننا تخصيص ترتيب العناصر في TreeSet باستخدام مقارنة مخصصة:
    data class Person(val name: String, val age: Int)

    // مقارنة مخصصة لترتيب الأشخاص حسب العمر تصاعديًا
    class PersonComparator : Comparator<Person> {
        override fun compare(p1: Person, p2: Person): Int {
            return p1.age - p2.age
        }
    }

    val persons = TreeSet<Person>(PersonComparator())
    persons.add(Person("علي", 30))
    persons.add(Person("خالد", 25))
    persons.add(Person("فهد", 35))

    println(persons) // يطبع الأشخاص مرتبين حسب العمر

}

/*
ما هي TreeSet؟
TreeSet في كوتلن هي مجموعة مرتبة وفريدة من العناصر. هذا يعني أنها:

مرتبة: العناصر في TreeSet يتم ترتيبها بشكل تصاعدي (أو تنازلي إذا تم تحديد مقارنة مخصصة).
فريدة: لا تسمح بتكرار العناصر، أي كل عنصر موجود مرة واحدة فقط.
لماذا نستخدم TreeSet؟
الترتيب التلقائي: إذا كنت بحاجة إلى مجموعة مرتبة بشكل طبيعي (مثل الأعداد، الأحرف الأبجدية)، فإن TreeSet تقوم بذلك تلقائيًا.
الفرادة: تضمن عدم وجود عناصر مكررة.
عمليات البحث السريعة: بسبب الترتيب، يمكن إجراء عمليات البحث بشكل فعال باستخدام خوارزميات البحث الثنائية.

 متى نستخدم TreeSet؟
البيانات المرتبة: عندما نحتاج إلى مجموعة مرتبة بشكل طبيعي أو حسب معيار معين.
البيانات الفريدة: عندما نريد ضمان عدم وجود عناصر مكررة.
عمليات البحث المتكررة: إذا كنا سنقوم بعمليات بحث متكررة في المجموعة، فإن TreeSet تكون فعالة بسبب الترتيب.

خلاصة
TreeSet هي أداة قوية في كوتلن لتخزين مجموعات مرتبة وفريدة من العناصر. إنها مفيدة بشكل خاص عندما تحتاج إلى ترتيب طبيعي للبيانات أو عندما تحتاج إلى إجراء عمليات بحث متكررة.

هل لديك أي أسئلة أخرى حول TreeSet أو هياكل البيانات الأخرى في كوتلن؟

ملاحظات إضافية:

الأداء: بشكل عام، يكون أداء TreeSet أبطأ قليلاً من HashSet و LinkedHashSet بسبب الحاجة إلى الحفاظ على الترتيب.
الوظائف العليا: يمكن استخدام الوظائف العليا مثل map و filter مع TreeSet، ولكن النتيجة ستكون دائمًا TreeSet جديدة.
 */
