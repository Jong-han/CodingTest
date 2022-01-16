package Level1

class 소수만들기 {
    fun solution(nums: IntArray): Int {
        var result = 0
        for (i in nums) {
            for (j in nums) {
                if ( j <= i) {
                    continue
                }
                for (k in nums) {
                    if ( k <= j) {
                        continue
                    }
                    if (isSosu(i+j+k)) {
                        result++
                    }
                }
            }
        }
        return result
    }
    fun isSosu(num: Int): Boolean {
        if (num == 1) {
            return true
        }
        return (2..num-1).filter { num%it == 0 }.isEmpty()
    }
}