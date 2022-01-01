package Level1

class 하샤드수 {
    fun solution(x: Int): Boolean {
        var answer = true

        val a = x.toString().run {
            var temp = 0
            this.forEach {
                temp += it.toString().toInt()
            }
            temp
        }

        return x%a==0
    }
}