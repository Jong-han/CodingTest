package Level1

fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
    var answer = intArrayOf()
    for ( c in commands ) {
        val temp = array.sliceArray(c[0]-1..c[1]-1).sorted() // sort()는 unit을 반환 sorted()는 정렬된 결과를 반환함
        answer = answer.plus(temp[c[2]-1]) // array에 값 추가하려면 plus 다만 add의 개념이 아니다.
    }
    return answer
}