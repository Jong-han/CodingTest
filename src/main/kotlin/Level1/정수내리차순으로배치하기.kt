package Level1

class 정수내리차순으로배치하기 {
    fun solution(n: Long): Long {
        return n.toString().map { it.toString().toInt() }.sorted().joinToString("") { it.toString() }.toLong()
    }
}