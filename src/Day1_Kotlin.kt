import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    // Kotlin 1.7.21 로 Test
    // 1. 숫자의 합 구하기
    // N개의 숫자가 공백 없이 써있다. 이 숫자를 모두 합해 출력하는 프로그램을 작성하시오.

    // (1). N값 입력받기 (System.in : 입력한 값을 바이트 단위로 읽는 것)
    val buffer = BufferedReader(InputStreamReader(System.`in`))
    val N = buffer.readLine().toInt()

    // (2)
    val s = buffer.readLine()
    buffer.close()

    // (3)
    var sum = 0

    // (4)
    for (i in 0..N - 1) {
        sum += s[i].toString().toInt()
    }
    println(sum)
    // buffer.close() -> buffer.close() 의 위치는 여기가 되어도 됌 (2) 에서는 88ms, 여기서는 92ms 가 걸림
}