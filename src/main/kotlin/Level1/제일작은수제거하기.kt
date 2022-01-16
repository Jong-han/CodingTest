package Level1

class 제일작은수제거하기 {
    fun solution(arr: IntArray): IntArray {
        return if (arr.size == 1) {
            intArrayOf(-1)
        } else {
            arr.filter { arr.minOrNull() != it }.toIntArray()
        }
    }
}