package Level2

class 최대값과최소값 {
    fun solution(s: String): String {
        val split = s.split(" ").map { it.toInt() }
        return "${split.minOrNull()} ${split.maxOrNull()}"
    }
}