package Level1

class 수박수박수박수박수박 {
    fun solution(n: Int): String {
        var answer = ""
        for ( i in 1..n ) {
            answer += if ( i % 2 == 0 ) "박" else "수"
        }
        return answer
    }
}