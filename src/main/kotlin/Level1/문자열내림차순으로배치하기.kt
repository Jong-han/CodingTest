package Level1

class 문자열내림차순으로배치하기 {
    fun solution(s: String): String {
        return s.toList().sortedDescending().joinToString("")
    }
}