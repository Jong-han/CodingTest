package Level2

import java.util.*

class 프린터 {
    fun solution(priorities: IntArray, location: Int): Int {
        var answer = 0
        val queue: Queue<Pair<Int,Boolean>> = LinkedList()
        priorities.forEachIndexed { i, p ->
            queue.add(p to (i == location))
        }

        while (!queue.isEmpty()) {
            val target = queue.peek()
            if (target == queue.maxByOrNull { it.first }) {
                answer++
                queue.poll()
                if (target.second) {
                    break
                }
            } else {
                queue.poll()
                queue.add(target)
            }
        }

        return answer
    }
}