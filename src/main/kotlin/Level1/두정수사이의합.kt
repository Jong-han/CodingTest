package Level1

class 두정수사이의합 {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        val start = if ( a > b ) b else a
        val end = if ( start == a ) b else a
        for ( i in start..end ) {
            answer += i.toLong()
        }
        return answer
    }
}