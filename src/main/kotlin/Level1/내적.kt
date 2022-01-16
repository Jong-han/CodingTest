package Level1

class 내적 {
    fun solution(a: IntArray, b: IntArray): Int {
        return a.zip(b) { i,j -> i*j }.sum()
    }
}