package Level1

class 숫자문자열과영단어 {
    fun solution(s: String): Int {
        var answer: String = s
        val numbers = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4, "five" to 5, "six" to 6, "seven" to 7, "eight" to 8, "nine" to 9, "zero" to 0)
        numbers.forEach { key, value ->
            answer = answer.replace(key,value.toString())
        }
        return answer.toInt()
    }
}