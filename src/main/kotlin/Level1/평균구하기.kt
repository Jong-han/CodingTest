package Level1

class 평균구하기 {
    fun solution(arr: IntArray): Double {
        var total = 0
        for ( i in arr ) {
            total += i
        }
        return total.toDouble()/arr.size.toDouble()
    }
}