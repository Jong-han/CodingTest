package Level1

class 부족한금액계산하기 {
    fun solution(price: Int, money: Int, count: Int): Long {
        var totalPrice:Long = 0
        for (i in 1..count) {
            totalPrice += price * i
        }
        val answer = totalPrice-money
        return if (answer > 0) answer else 0
    }
}