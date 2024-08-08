# LinkedQueue

LinkedQueue هي بنية بيانات قائمة انتظار (Queue) تعتمد على قائمة مرتبطة (Linked List). تتميز بإضافة عناصر من الخلف وحذفها من الأمام، مما يجعلها مثالية لتمثيل سلوك الانتظار في العديد من التطبيقات.

### تنفيذ LinkedQueue في كوتلن

```kotlin
class LinkedQueue<T> {
    private inner class Node<T>(val value: T) {
        var next: Node<T>? = null
    }

    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    fun enqueue(item: T) {
        val newNode = Node(item)
        if (isEmpty()) {
            head = newNode
        } else {
            tail?.next = newNode
        }
        tail = newNode
    }

    fun dequeue(): T? {
        if (isEmpty()) {
            return null
        }
        val item = head?.value
        head = head?.next
        if (head == null) {
            tail = null
        }
        return item
    }

    fun peek(): T? {
        return head?.value
    }

    fun isEmpty(): Boolean {
        return head == null
    }
}

```

### شرح الكود

- **Node:** هذه هي الفئة الداخلية التي تمثل عقدة في القائمة المرتبطة. تحتوي على قيمة (value) ومرجع إلى العقدة التالية (next).
- **head:** يشير إلى أول عقدة في القائمة (الأمام).
- **tail:** يشير إلى آخر عقدة في القائمة (الخلف).
- **enqueue(item: T):** هذه الدالة تضيف عنصرًا جديدًا إلى نهاية القائمة.
- **dequeue(): T?:** هذه الدالة تزيل وتعيد العنصر الأول في القائمة.
- **peek(): T?:** هذه الدالة ترجع العنصر الأول دون إزالته.
- **isEmpty(): Boolean:** هذه الدالة تحقق إذا كانت القائمة فارغة.

### مثال على الاستخدام

```kotlin
fun main() {
    val queue = LinkedQueue<String>()
    queue.enqueue("Alice")
    queue.enqueue("Bob")
    queue.enqueue("Charlie")

    println(queue.dequeue()) // يطبع Alice
    println(queue.peek()) // يطبع Bob
}

```

### مزايا LinkedQueue

- **مرونة:** يمكن إضافة أو حذف العناصر بسهولة.
- **كفاءة:** عمليات الإضافة والحذف من الأمام والخلف تتم بشكل ثابت (O(1)).
- **بساطة:** يمكن تنفيذها بسهولة باستخدام كوتلن.

### استخدامات LinkedQueue

- **تنفيذ خوارزميات البحث:** مثل البحث العرضي (BFS).
- **تمثيل عمليات الانتظار:** مثل طابور الطباعة أو طابور العمليات.
- **تنفيذ هياكل بيانات أخرى:** مثل المكدس (Stack).

**ملاحظات:**

- يمكن إضافة ميزات إضافية إلى هذه الفئة، مثل:
    - **size(): Int:** لإرجاع حجم القائمة.
    - **contains(item: T): Boolean:** للتحقق من وجود عنصر معين.
    - **clear(): Unit:** لتصفية القائمة.
- **Kotlin Collections API:** توفر كوتلن واجهة برمجة تطبيقات (API) غنية للتعامل مع القوائم، بما في ذلك LinkedList. يمكنك استخدام هذه الواجهة لتبسيط بعض العمليات.