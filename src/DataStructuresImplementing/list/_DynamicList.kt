package DataStructuresImplementing.list

/*
class DynamicList<T> {
    var data: Array<Any?>
    var size: Int = 0

    init {
        data = arrayOfNulls(1)
    }

    fun getSize(): Int {
        return data.size
    }

    fun get(index: Int): T? {
        return data[index] as T?
    }

    fun put(element: Any?) {
        ensureCapacity(size + 1)
        data[size++] = element
    }

    fun ensureCapacity(minCapacity: Int) {
        val oldCapacity = getSize()
        if (minCapacity > oldCapacity) {
            var newCapacity = oldCapacity * 2
            if (newCapacity < minCapacity) newCapacity = minCapacity
            data = data.copyOf(newCapacity)
        }
    }
}*/