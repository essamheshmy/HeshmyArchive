package DataStructuresUse.Sets.LinkedHashSet

fun _LinkedHashSet(){
    // إنشاء LinkedHashSet فارغة للأعداد الصحيحة
    val numbers = LinkedHashSet<Int>()

// إضافة عناصر
    numbers.add(10)
    numbers.add(20)
    numbers.add(30)
    numbers.add(20) // لن يتم إضافته لأن 20 موجود بالفعل

// طباعة العناصر (ستكون بالترتيب الذي أضيفت به)
    println(numbers) // قد يطبع [10, 20, 30]

// مثال آخر: تخزين سلسلة من الأحداث
    val events = LinkedHashSet<String>()
    events.add("حدث A")
    events.add("حدث B")
    events.add("حدث A") // لن يتم إضافته
    events.add("حدث C")

// طباعة الأحداث بترتيب حدوثها
    println(events) // سيطبع [حدث A, حدث B, حدث C]

}
/*
LinkedHashSet هي مجموعة في كوتلن تجمع بين مميزات HashSet و LinkedHashMap. فهي:

غير مرتبة: تمامًا مثل HashSet، لا تضمن ترتيبًا محددًا لعناصرها.
تفرد العناصر: مثل HashSet، لا تسمح بوجود عناصر مكررة.
تحافظ على ترتيب الإضافة: مثل LinkedHashMap، تحافظ على الترتيب الذي أضيفت به العناصر.
لماذا نستخدم LinkedHashSet؟

عندما نريد مجموعة من العناصر الفريدة: تمامًا مثل HashSet.
عندما نريد الحفاظ على ترتيب الإضافة: مثلاً، عند تخزين سلسلة من الأحداث بترتيب حدوثها.
*/