package Level1

class X만큼간격이있는N개의숫자 {
    class Solution {
        fun solution(x: Int, n: Int): LongArray {
            return LongArray(n){ ((it+1).toLong() * x.toLong()) }
        }
    }
}