package Level1

class 음양더하기 {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var result = 0
        absolutes.forEachIndexed { i, num ->
            if (signs[i]) {
                result += num
            } else {
                result -= num
            }
        }
        return result
    }
}