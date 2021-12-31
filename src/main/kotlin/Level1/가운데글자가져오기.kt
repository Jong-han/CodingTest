package Level1

class 가운데글자가져오기 {
    fun solution(s: String): String {
        return if (s.length % 2 == 1) {
            s[s.length / 2].toString()
        } else {
            "${s[s.length/2-1]}${s[s.length / 2]}"
        }
    }
}