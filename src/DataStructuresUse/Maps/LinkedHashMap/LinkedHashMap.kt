package DataStructuresUse.Maps.LinkedHashMap

fun _LinkedHashMap(){
    val linkedMap = LinkedHashMap<String, Int>()
    linkedMap["علي"] = 30
    linkedMap["خالد"] = 25
    linkedMap["فهد"] = 35

// طباعة العناصر بالترتيب الذي أضيفت به
    for ((name, age) in linkedMap) {
        println("$name is $age years old")
    }

}
/*
LinkedHashMap في كوتلن: حافظ على ترتيب الإضافة
ما هي LinkedHashMap؟
LinkedHashMap في كوتلن هي نوع خاص من HashMap يحافظ على ترتيب إضافة العناصر. بعبارة أخرى، عندما تضيف عناصر إلى LinkedHashMap، يتم تخزينها بالترتيب الذي أضفتها به، وليس بالترتيب العشوائي كما يحدث في HashMap العادية.

لماذا نستخدم LinkedHashMap؟
الحفاظ على الترتيب: إذا كنت بحاجة إلى الحفاظ على ترتيب إضافة العناصر، فإن LinkedHashMap هو الخيار الأمثل.
الوصول السريع: مثل HashMap، يمكنك الوصول إلى عنصر بناءً على مفتاحه بسرعة.
الفرادة: مثل HashMap، لا يسمح بتكرار المفاتيح.
كيف تعمل LinkedHashMap؟
LinkedHashMap تستخدم بنية بيانات داخلية تسمح لها بتتبع ترتيب الإضافة بالإضافة إلى حفظ العلاقة بين المفتاح والقيمة. عندما تضيف عنصرًا جديدًا، يتم إضافته إلى نهاية القائمة المرتبة.


 */