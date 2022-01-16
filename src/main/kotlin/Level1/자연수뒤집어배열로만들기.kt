package Level1

class 자연수뒤집어배열로만들기 {
    fun solution(n: Long): IntArray {
        return n.toString().reversed().map { it.toString().toInt() }.toIntArray()
    }
}