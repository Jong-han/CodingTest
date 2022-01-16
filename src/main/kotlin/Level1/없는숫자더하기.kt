package Level1

class 없는숫자더하기 {
    fun solution(numbers: IntArray): Int {
        val nums = 0..9
        return nums.filter{ !numbers.contains(it) }.sum()
    }
}