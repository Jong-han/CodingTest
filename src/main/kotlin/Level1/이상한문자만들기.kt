package Level1

class 이상한문자만들기 {
    fun solution(s: String): String {
        val splitList = s.split(" ")
        return splitList.mapIndexed { index, word ->
            val result = word.mapIndexed { i, c ->
                when (i%2) {
                    0 -> c.toUpperCase()
                    else -> c.toLowerCase()
                }
            }.joinToString("")
            if (index == splitList.size-1) {
                result
            } else "$result "
        }.joinToString("")
    }
}