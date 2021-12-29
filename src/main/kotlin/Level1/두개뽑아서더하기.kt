package Level1

class 두개뽑아서더하기 {

    fun solution(numbers: IntArray): IntArray {

        val set = mutableSetOf<Int>()
        numbers.forEachIndexed { cnt, a ->

            for ( b in cnt+1 until numbers.size) {

                set.add(a+numbers[b])

            }

        }

        return set.toList().sorted().toIntArray()
    }

}