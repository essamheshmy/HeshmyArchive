package Algorithm.Searching.BinarySearch

fun binarySearch(sortedText: List<String>, searchText: String): Int {
    var left = 0
    var right = sortedText.size - 1

    while (left <= right) {
        val middle = (left + right) / 2
        val compareResult = sortedText[middle].compareTo(searchText)

        when {
            compareResult == 0 -> return middle
            compareResult < 0 -> left = middle + 1
            else -> right = middle - 1
        }
    }
    return -1
}
