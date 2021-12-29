package Level1

class 서울에서김서방찾기 {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        for ( i in 0 until seoul.size ) {
            if ( seoul[i] == "Kim" ) {
                answer = "김서방은 ${i}에 있다"
                break
            }
        }
        return answer
    }
}