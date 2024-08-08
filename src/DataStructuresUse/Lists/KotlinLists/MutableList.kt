package DataStructuresUse.Lists.KotlinLists

fun _MutableList(){
    val numbers: MutableList<Int> = mutableListOf()
// إضافة عناصر
    numbers.add(10)
    numbers.add(20)
    numbers.add(30)
// حذف عنصر
    numbers.removeAt(1) // يحذف العنصر الثاني (الذي قيمته 20)
// تغيير قيمة عنصر
    numbers[0] = 42 // يغير قيمة العنصر الأول
// طباعة القائمة
    println(numbers) // يطبع [42, 30]
}
/*
ما هي MutableList في كوتلن؟
MutableList في كوتلن هي واجهة (interface) تمثل قائمة يمكن تعديلها، أي يمكنك إضافة عناصر جديدة إليها، أو حذف عناصر موجودة، أو حتى تغيير قيمة عنصر موجود. بعبارة أخرى، هي قائمة ديناميكية يمكن أن تتغير بعد إنشائها.

لماذا نستخدم MutableList؟
المرونة: تسمح بإضافة وحذف وتعديل العناصر بسهولة.
التنوع: يمكن استخدامها لتخزين أنواع مختلفة من البيانات.
الوظائف العليا: تدعم مجموعة واسعة من الوظائف العليا مثل map و filter و reduce.
*/
