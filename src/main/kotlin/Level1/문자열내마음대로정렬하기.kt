package Level1

class 문자열내마음대로정렬하기 {
    fun solution(strings: Array<String>, n: Int): Array<String> {
        val answer = strings.sorted().sortedBy { it[n] }
        return answer.toTypedArray()
    }
}