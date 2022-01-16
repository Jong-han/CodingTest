package Level1

class 최대공약수와최소공배수 {
    fun solution(n: Int, m: Int): IntArray {
        val min = getMin(n,m)
        return intArrayOf(min, n*m/min)
    }
    fun getMin(n: Int, m: Int): Int {
        val r = m%n
        if (r==0) {
            return n
        } else {
            return getMin(r,n)
        }
    }
}