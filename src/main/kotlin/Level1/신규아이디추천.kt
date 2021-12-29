package Level1

class 신규아이디추천 {
    fun solution(new_id: String): String {
        return step7(step6(step5(step4(step3(step2(step1(new_id)))))))
    }
    fun step1(id: String): String {
        return id.toLowerCase() // kotlin 버전이 높으면 .lowercase()
    }
    fun step2(id: String): String {
        var result = id
        val charList = listOf('-','_','.')
        result = id.filter {
            it.isLetterOrDigit() || charList.contains(it)
        }
        return result
    }
    fun step3(id: String): String {
        return id.replace("[.]*[.]".toRegex(), ".")
    }
    fun step4(id: String): String {
        return id.removePrefix(".").removeSuffix(".")
    }
    fun step5(id: String): String {
        return if (id.isEmpty()) "a" else id
    }
    fun step6(id: String): String {
        return if (id.length > 15) step5(id.substring(0,15)).removeSuffix(".") else id
    }
    fun step7(id: String): String {
        return if (id.length > 2)
            id
        else {
            var result = id
            while (result.length < 3) {
                result += result.last()
            }
            result
        }
    }
}