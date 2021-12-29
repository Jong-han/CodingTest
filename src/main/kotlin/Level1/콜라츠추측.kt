package Level1

class 콜라츠추측 { // Int 줘놓고선 Long으로 형변환 안하면 틀리는 그지같은 문제
    fun solution(num: Int): Int {
        var answer = 0
        var a = num.toLong()
        if (num == 1) {
            return answer
        } else {
            answer++
            while(collatz(a.toLong()) != 1L) {
                a = collatz(a.toLong())
                answer++
                if ( answer >= 500 ) {
                    answer = -1
                    break
                }
            }
            return answer
        }
    }

    fun collatz(num: Long): Long {
        return if (num%2==0L) {
            num / 2
        } else {
            num * 3 + 1
        }
    }
}