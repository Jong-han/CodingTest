package Level1

class 나머지가1이되는수찾기 {
    fun solution(n: Int): Int {
        var answer: Int = 2
        while ( true ) {

            if ( n % answer == 1) {
                break
            }
            answer++

        }
        return answer
    }
}