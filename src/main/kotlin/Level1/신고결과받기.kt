package Level1

class 신고결과받기 {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {

        val realReport = report.toSet().toList()

        val idMap = mutableMapOf<String,Int>()
        id_list.forEach {
            idMap[it] = 0
        }
        val bannedMap = mutableMapOf<String,Int>()
        realReport.forEach {
            val key = it.split(" ")[1]
            bannedMap[key] = if (bannedMap[key]==null) 1 else bannedMap[key]!! + 1
        }
        realReport.forEach {
            val split = it.split(" ")
            val user = split[0]
            val reported = split[1]
            bannedMap[reported]?.let { count ->
                if (count >= k) {
                    idMap[user] = idMap[user]!!+1
                }
            }
        }

        return idMap.map{ it.value }.toIntArray()
    }
}