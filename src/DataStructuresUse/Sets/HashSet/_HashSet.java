package DataStructuresUse.Sets.HashSet;

import java.util.HashSet;

public class _HashSet {

    public static void hashSet(){

                HashSet<String> fruits = new HashSet<>();
                fruits.add("تفاح");
                fruits.add("موز");
                fruits.add("عنب");
                fruits.add("تفاح"); // لن يتم إضافته لأنه موجود بالفعل

                System.out.println(fruits);
                /*
في هذا المثال:
أنشأنا HashSet لتخزين أسماء الفواكه.
حاولنا إضافة "تفاح" مرتين، لكن تم إضافة العنصر مرة واحدة فقط.
                 */
            }
        }

/*
HashSet في جافا هي مجموعة غير مرتبة من العناصر الفريدة. هذا يعني أنها:

غير مرتبة: لا يتم حفظ ترتيب إضافة العناصر.
فريدة: لا تسمح بتكرار العناصر، أي كل عنصر موجود مرة واحدة فقط.
لماذا نستخدم HashSet؟
التحقق من وجود عنصر: يمكنك التحقق بسرعة مما إذا كان عنصر موجود في المجموعة أم لا.
إزالة العناصر المكررة: إذا كان لديك مجموعة من العناصر وتريد إزالة التكرارات، فإن HashSet هي الأداة المثالية.
تنفيذ العمليات المنطقية على المجموعات: مثل الاتحاد، التقاطع، الفرق.
كيف تعمل HashSet؟
HashSet تستخدم جدول التجزئة (Hash Table) لتخزين العناصر. يتم حساب قيمة هاش لكل عنصر، وتستخدم هذه القيمة لتحديد موقع العنصر في الجدول. هذا يجعل عمليات البحث والإضافة والحذف سريعة جدًا.

متى نستخدم HashSet؟
عندما لا يهم ترتيب العناصر: إذا كنت لا تحتاج إلى حفظ ترتيب العناصر.
عندما تريد ضمان عدم تكرار العناصر: إذا كنت تريد التأكد من أن كل عنصر موجود مرة واحدة فقط.
عندما تحتاج إلى عمليات بحث سريعة: إذا كنت ستقوم بعمليات بحث متكررة في المجموعة.

 مزايا HashSet:
سرعة الوصول: عمليات البحث والإضافة والحذف تتم بسرعة عالية.
الفرادة: تضمن عدم وجود عناصر مكررة.
سهولة الاستخدام: توفر العديد من الوظائف المفيدة للتعامل مع المجموعات.
نقاط ضعف HashSet:
غير مرتب: لا يضمن ترتيب العناصر.
لا يسمح بالوصول عن طريق الفهرس: لا يمكنك الوصول إلى عنصر باستخدام فهرسه.
خلاصة
HashSet هي أداة مفيدة في جافا لتخزين مجموعات غير مرتبة من العناصر الفريدة. إذا كنت لا تحتاج إلى الحفاظ على ترتيب العناصر وتريد ضمان عدم تكرارها، فإن HashSet هو الخيار الأمثل.
 */