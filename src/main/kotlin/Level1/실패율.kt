package Level1

class 실패율 {
    fun solution(N: Int, stages: IntArray): IntArray {
        var answer = intArrayOf()
        val failList = (1..N).map { stage ->
            var total = 0
            var stay = 0
            stages.forEachIndexed { i, user ->
                if (user >= stage) {
                    total++
                }
                if (user == stage) {
                    stay++
                }
            }
            if (total == 0 && stay == 0) {
                stage to 0f
            } else {
                stage to stay.toFloat()/total.toFloat()
            }
        }
        return failList.sortedBy { it.first }.sortedByDescending { it.second }.map{ it.first }.toIntArray()
    }
}