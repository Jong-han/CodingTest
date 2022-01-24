package Level2

class 가장큰수 {
    fun solution(numbers: IntArray): String {
        var answer = ""
        val temp = numbers.map { it.toString() }.sortedWith (Comparator { o1, o2 ->
            if (o1.length == o2.length) {
                o2.compareTo(o1)
            } else {
                (o2+o1).compareTo(o1+o2)
            }
        })
        if (temp[0]=="0") {
            answer = "0"
        } else {
            temp.forEach {
                answer+=it
            }
        }
        return answer
    }
}