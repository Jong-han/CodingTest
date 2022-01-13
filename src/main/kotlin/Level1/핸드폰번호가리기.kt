package Level1

class 핸드폰번호가리기 {
    fun solution(phone_number: String): String {
        return phone_number.mapIndexed { i, c ->
            if (i < phone_number.length-4) {
                '*'
            } else
                c
        }.joinToString("")
    }
}