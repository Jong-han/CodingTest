package Level1

class `3진법뒤집기` {
    fun solution(n: Int): Int {
        return getThree(n.toLong()).toList().reversed().mapIndexed { i, c -> c.toString().toLong() * Math.pow(3.0,i.toDouble()) }.sum().toInt()
    }
    fun getThree(n: Long): String {
        val a = (n % 3L).toString()
        val b = n / 3L
        if (b <= 1L ) {
            return if (b!=0L) "$a$b" else "$a"
        } else {
            return "${a}${getThree(b)}"
        }
    }
}