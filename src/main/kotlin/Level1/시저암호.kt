package Level1

class 시저암호 {
    fun solution(s: String, n: Int): String {
        return s.map {
            when (it) {
                in 'a'..'y' -> if (it+n > 'z') 'a'+(n-('z'-it)-1) else it+n
                in 'A'..'Y' -> if (it+n > 'Z') 'A'+(n-('Z'-it)-1) else it+n
                'z' -> 'a'+(n-1)
                'Z' -> 'A'+(n-1)
                else -> it
            }
        }.joinToString("")
    }
}