package Level1

class 로또최고순위와최저순위 {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        var min = lottos.filter { win_nums.contains(it) }.size
        val max = min + lottos.filter { it == 0 }.size

        return intArrayOf(mapping(max), mapping(min))
    }
    fun mapping(winsCount: Int): Int {
        val result = 7 - winsCount
        return if (result > 6 ) 6 else result
    }
}