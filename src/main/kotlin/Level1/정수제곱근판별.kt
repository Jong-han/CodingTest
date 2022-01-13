package Level1

class 정수제곱근판별 {
    fun solution(n: Long): Long {
        var answer: Long = 0
        val a = Math.sqrt(n.toDouble())
        val b = a.toString()
        return if (b.last()=='0') Math.pow(b.toDouble()+1.0,2.0).toLong() else -1
    }
}