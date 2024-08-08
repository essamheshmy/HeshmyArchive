package DataStructuresImplementing.Queue

class KotlinQueue<T> {
    private var storage= arrayListOf<T>()
    var cont:Int=storage.size
     fun isEmpty(): Boolean =cont==0
    fun enqueue(item: T): Boolean {
      return  storage.add(item)
    }
   fun peek(): T? =storage.removeAt(0)

    fun dequeue(): T? {
        return if (isEmpty()) null else storage.removeAt(0)
    }


}