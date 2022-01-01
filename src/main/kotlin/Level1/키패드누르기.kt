package Level1

class 키패드누르기 {
    fun solution(numbers: IntArray, hand: String): String {
        var answer = ""

        val keyPad  = arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9),arrayOf(-1,0,-2))
        var leftPos = -1
        var rightPos = -2

        numbers.forEach {
            val pushResult = pushNumber(it, leftPos, rightPos, keyPad, hand)
            answer += pushResult.first
            leftPos = pushResult.second
            rightPos = pushResult.third
        }

        return answer
    }
    fun pushNumber(num: Int, leftPos: Int, rightPos: Int, keyPad: Array<Array<Int>>, hand: String): Triple<String,Int,Int> {
        return when ( num ) {

            1,4,7 -> Triple("L",num,rightPos)
            3,6,9 -> Triple("R",leftPos,num)
            else -> {
                val leftDis = calculateDistance(leftPos, num, keyPad)
                val rightDis = calculateDistance(rightPos, num, keyPad)
                when {
                    leftDis > rightDis -> Triple("R",leftPos,num)
                    rightDis > leftDis -> Triple("L",num,rightPos)
                    else -> if (hand=="right") Triple("R",leftPos,num) else Triple("L",num,rightPos)
                }
            }

        }
    }
    fun calculateDistance(pos: Int, target: Int, keyPad: Array<Array<Int>>): Int {
        val posLine = keyPad.first { it.contains(pos) }
        val posIndexX = keyPad.indexOf(posLine)
        val posIndexY = posLine.indexOf(pos)

        val targetLine = keyPad.first { it.contains(target) }
        val targetIndexX = keyPad.indexOf(targetLine)
        val targetIndexY = targetLine.indexOf(target)

        return Math.abs(posIndexX - targetIndexX) + Math.abs(posIndexY - targetIndexY)
    }
}