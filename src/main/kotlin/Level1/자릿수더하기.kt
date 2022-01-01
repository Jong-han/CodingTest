package Level1

class 자릿수더하기 {
    fun solution(n: Int): Int {
        var answer = 0

        n.toString().forEach {
            answer += it.toString().toInt()
        }

        return answer
    }
}