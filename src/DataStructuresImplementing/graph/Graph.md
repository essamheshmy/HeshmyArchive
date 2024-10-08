# Graph

الجراف (Graph) في علم الحاسوب هو بنية بيانات تمثل مجموعة من العقد (Nodes) المرتبطة ببعضها البعض بواسطة حواف (Edges). تخيل شبكة اجتماعية، حيث الأشخاص هم العقد والصداقات بينهم هي الحواف. يمكن استخدام الجرافات لتمثيل العديد من الظواهر الحقيقية مثل شبكات الطرق، الخرائط، هياكل البيانات المعقدة، وغيرها الكثير.

### أنواع الجرافات

- **الجراف غير الموجه (Undirected Graph):** الحافة بين عقدتين تكون ثنائية الاتجاه.
- **الجراف الموجه (Directed Graph):** الحافة بين عقدتين تكون ذات اتجاه واحد.
- **الجراف الموزون (Weighted Graph):** لكل حافة قيمة عددية تمثل وزنها (مثل المسافة أو التكلفة).

### تمثيل الجرافات في جافا

هناك عدة طرق لتمثيل الجرافات في جافا، ومن أشهرها:

1. **مصفوفة المجاورة (Adjacency Matrix):**
    - مصفوفة ثنائية الأبعاد حيث الصفوف والأعمدة تمثل العقد.
    - القيمة في المصفوفة تشير إلى وجود حافة بين العقدتين.
    - مناسبة للجرافات الكثيفة (ذات عدد كبير من الحواف).
    - **مثال:**

```java
int[][] adjacencyMatrix = {
    {0, 1, 0},
    {1, 0, 1},
    {0, 1, 0}
};

```

**قائمة المجاورة (Adjacency List):**

- كل عقدة في الجراف لها قائمة تحتوي على العقد المجاورة لها.
- مناسبة للجرافات المتفرقة (ذات عدد قليل من الحواف).
- **مثال:**

```java
List<List<Integer>> adjacencyList = new ArrayList<>();
// ... إضافة العناصر إلى القائمة ...

```

تنفيذ بسيط لجراف باستخدام قائمة المجاورة

```java
import java.util.*;

class Graph {
    private int V; // عدد العقد
    private List<List<Integer>> adj; // قائمة المجاورة

    Graph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; ++i)
            adj.add(new ArrayList<>());
    }

    void addEdge(int v, int w) {
        adj.get(v).add(w);
    }

    void printGraph() {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("adjacency list of vertex" + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println("\n");
        }
    }
}

```

### استخدامات الجرافات

- **خوارزميات البحث:** مثل خوارزمية البحث العرضي (BFS) والبحث العميق (DFS).
- **تحليل الشبكات:** مثل شبكات التواصل الاجتماعي، شبكات الطرق.
- **تخطيط المسارات:** مثل خرائط Google.
- **حل مشاكل التلوين:** مثل مشكلة تلوين الخريطة.
- **تحليل البيانات:** مثل تحليل الشبكات الاجتماعية.

### أمثلة على تطبيقات الجرافات

- **شبكات التواصل الاجتماعي:** كل مستخدم هو عقدة، والصداقة بين المستخدمين هي حافة.
- **خرائط Google:** المدن هي عقد والحواف تمثل الطرق بين المدن.
- **شبكات الكهرباء:** المحطات هي عقد والخطوط الكهربائية هي حواف.

**ملاحظات:**

- يمكن تمثيل الجرافات الموزونة بإضافة وزن لكل حافة في القائمة المجاورة.
- يمكن استخدام الجرافات لحل مجموعة واسعة من المشاكل في علوم الحاسوب.
- هناك العديد من الخوارزميات المتقدمة للعمل مع الجرافات، مثل خوارزمية Dijkstra للعثور على أقصر مسار، وخوارزمية Kruskal لإيجاد شجرة امتداد ضئيلة.

**هل لديك أي أسئلة أخرى حول الجرافات أو تريد المزيد من الأمثلة؟**

يمكنني شرح مفاهيم أخرى مثل:

- **خوارزميات البحث في الجرافات**
- **تطبيقات متقدمة للجرافات**
- **تمثيل الجرافات باستخدام هياكل بيانات أخرى**