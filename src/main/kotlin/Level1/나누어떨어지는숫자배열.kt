package Level1

class 나누어떨어지는숫자배열 {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        val result = arr.filter { it%divisor == 0 }.sorted().toIntArray()
        return if (result.size == 0) intArrayOf(-1) else result
    }
}