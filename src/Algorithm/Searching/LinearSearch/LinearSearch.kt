package Algorithm.Searching.LinearSearch

fun linearSearch(text: String, searchText: String): Int {
    for (i in text.indices) {
        if (text.substring(i, i + searchText.length) == searchText) {
            return i
        }
    }
    return -1 // لم يتم العثور على النص
}
