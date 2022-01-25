package Level2

class h_index {
    fun solution(citations: IntArray): Int {
        var answer = 0
        val sortedArray = citations.sortedDescending()
        run {
            (0..sortedArray[0]).reversed().forEach { a ->
                if (a <= sortedArray.filter { b -> b>=a }.size) {
                    answer = a
                    return@run
                }
            }
        }
        return answer
    }
}