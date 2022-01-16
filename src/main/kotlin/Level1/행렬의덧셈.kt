package Level1

class 행렬의덧셈 {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        return arr1.zip(arr2) { a, b -> a.zip(b) { c, d -> c + d }.toIntArray() }.toTypedArray()
    }

}