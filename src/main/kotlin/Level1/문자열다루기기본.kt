package Level1

class 문자열다루기기본 {
    fun solution(s: String): Boolean {
        return (s.filter { it.isDigit() }.length == s.length) && (s.length == 4 || s.length == 6)
    }
}