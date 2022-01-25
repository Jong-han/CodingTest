package Level2

class 피보나치수 {
    fun solution(n: Int): Int {

        return fibo(n)
    }
    fun fibo(n: Int): Int {
        val a = mutableListOf<Int>()
        for (i in 0..n) {
            if (i<=1) {
                a.add(i,i%1234567)
            } else {
                a.add(i, (a[i-1]+a[i-2])%1234567)
            }
        }
        return a[n]
    }
}