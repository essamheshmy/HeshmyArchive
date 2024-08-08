package DataStructuresImplementing.stack

class Stack<T>(/*var size:Int*/ ) {

    private var storage= arrayListOf<T>()
    var cont:Int=storage.size
    //override fun isFull(): Boolean= cont==size
     fun isEmpty(): Boolean =cont==0
     fun push(item: T) {
        storage.add(item)
    }
     fun pop(): T?=storage.removeLastOrNull()
    fun peek(): T? = storage.lastOrNull()
   fun printStackItems() {
        TODO("Not yet implemented")
    }


}