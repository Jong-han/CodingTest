package Level1

class 모의고사 {
    fun solution(answers: IntArray): IntArray {
        val result = getSolved(answers)

        val a = result.first
        val b = result.second
        val c = result.third

        val supoList = listOf(a,b,c)

        val max = supoList.max()

        var zz = intArrayOf()

        supoList.forEachIndexed { i, supo ->
            if (supo==max) {
                zz = zz.plus(i+1)
            }
        }
        return zz
    }
    fun getSolved(answers: IntArray): Triple<Int,Int,Int> {

        val pattern1 = intArrayOf(1,2,3,4,5)
        val pattern2 = intArrayOf(2,1,2,3,2,4,2,5)
        val pattern3 = intArrayOf(3,3,1,1,2,2,4,4,5,5)

        var a = 0
        var b = 0
        var c = 0

        answers.forEachIndexed { i, answer ->
            if (answer == pattern1[i%pattern1.size]) {
                a++
            }
            if (answer == pattern2[i%pattern2.size]) {
                b++
            }
            if (answer == pattern3[i%pattern3.size]) {
                c++
            }
        }
        return Triple(a,b,c)
    }
}