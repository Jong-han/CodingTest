package Level1

class 크레인형뽑기게임 {
    fun solution(board: Array<IntArray>, moves: IntArray): Int {
        var answer = 0
        var bucket = mutableListOf<Int>()

        val newBoard = board.map { it.toMutableList() }

        moves.forEach { move ->
            for(i in 0 until newBoard.size) {
                if (newBoard[i][move-1] != 0) {
                    bucket.add(newBoard[i][move-1])
                    val popResult = pop(bucket)
                    bucket = popResult.first
                    answer += popResult.second
                    newBoard[i][move-1] = 0
                    break
                }
            }
        }

        return answer
    }

    fun pop(list: MutableList<Int>): Pair<MutableList<Int>, Int> {
        if (list.size < 2) {
            return list to 0
        }
        return if (list[list.size-1] == list[list.size-2]) {
            list.removeAt(list.size-1)
            list.removeAt(list.size-1)
            list to 2
        } else {
            list to 0
        }
    }
}