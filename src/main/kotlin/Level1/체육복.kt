package Level1

class 체육복 {

    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        var answer = 0

        // 잃어버린 리스트, 여분 리스트에서 겹치는 값을 빼 진짜 잃어버린 리스트만 남김
        var lostSet = (lost.toSet() - reserve.toSet()).toList().sorted()
        var reserveSet = ((reserve.toSet() - lost.toSet())).toMutableList()

        answer = n - lostSet.size

        lostSet.forEach { lost ->
            when {
                lost-1 in reserveSet -> {
                    answer++
                    reserveSet.remove(lost-1)
                }
                lost+1 in reserveSet -> {
                    answer++
                    reserveSet.remove(lost+1)
                }

            }

        }
        return answer
    }

}