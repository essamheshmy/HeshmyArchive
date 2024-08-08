package DataStructuresUse.Maps.LinkedHashMap;

import java.util.LinkedHashMap;

public class _LinkedHashMap {
    public static void LinkedHashMap(){
        LinkedHashMap<String, String> languages = new LinkedHashMap<>();
        languages.put("Java", "Object-oriented");
        languages.put("Python", "Interpreted");
        languages.put("C++", "Compiled");

        // طباعة العناصر بترتيب إدخالها
        for (String language : languages.keySet()) {
            System.out.println(language + ": " + languages.get(language));
        }
/*
في هذا المثال:

قمنا بإنشاء LinkedHashMap لتخزين لغات البرمجة وصفًا موجزًا لها.
تم إضافة اللغات بترتيب معين.
عند الطباعة، تم عرض اللغات بنفس الترتيب الذي تم إضافتها به.
 */
    }
}

/*
LinkedHashMap في جافا هي بنية بيانات تجمع بين مميزات HashMap و LinkedList. فهي تعمل كـ HashMap حيث تخزن الأزواج من المفتاح والقيمة (key-value pairs)، ولكنها تحافظ أيضًا على ترتيب إدخال هذه الأزواج، تمامًا كما تفعل LinkedList.

لماذا نستخدم LinkedHashMap؟
الحفاظ على ترتيب الإدخال: إذا كنت بحاجة إلى الحفاظ على الترتيب الذي تم فيه إضافة العناصر إلى الخريطة، فإن LinkedHashMap هو الخيار الأمثل.
الوصول السريع: مثل HashMap، يمكنك الوصول إلى عنصر بناءً على مفتاحه بسرعة.
الترتيب: يمكنك أيضًا الحصول على عناصر الخريطة بترتيب إدخالها.
كيف تعمل LinkedHashMap؟
LinkedHashMap تستخدم جدول التجزئة (Hash table) لتخزين العناصر، تمامًا مثل HashMap. ولكن بالإضافة إلى ذلك، تستخدم أيضًا قائمة مرتبطة (Linked list) لتتبع ترتيب إدخال العناصر. عندما يتم إضافة عنصر جديد، يتم إضافته إلى نهاية القائمة المرتبطة.

متى نستخدم LinkedHashMap؟
الذاكرة المؤقتة: تستخدم LinkedHashMap بشكل شائع في تنفيذ الذاكرة المؤقتة (cache) حيث يتم تخزين العناصر الأكثر حداثة في البداية.
السجلات: يمكن استخدامها لتخزين السجلات بحيث يتم عرض أحدث السجلات أولاً.
التحكم في الترتيب: عندما تحتاج إلى التحكم في ترتيب العناصر المعروضة.

مقارنة بين LinkedHashMap و HashMap و TreeMap:
الميزة	HashMap	TreeMap	LinkedHashMap
الترتيب	غير مرتب	مرتب حسب المفتاح	مرتب حسب ترتيب الإدخال
الفرادة	لا يسمح بتكرار المفاتيح	لا يسمح بتكرار المفاتيح	لا يسمح بتكرار المفاتيح
الأداء	أسرع بشكل عام	أبطأ قليلاً من HashMap ولكن يوفر ترتيبًا	أداء متوسط بين HashMap و TreeMap


خلاصة
LinkedHashMap هي أداة مفيدة في جافا عندما تحتاج إلى الحفاظ على ترتيب إدخال العناصر بالإضافة إلى الاستفادة من مميزات HashMap. إنها توفر توازنًا جيدًا بين الأداء والمرونة.
 */