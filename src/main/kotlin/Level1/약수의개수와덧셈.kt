package Level1

class 약수의개수와덧셈 {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        (left..right).forEach { a ->
            val size = (1..a).filter{ a%it == 0 }.size
            if (size % 2 == 0) {
                answer += a
            } else {
                answer -= a
            }
        }
        return answer
    }
}