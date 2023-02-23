import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.StringTokenizer

fun main() {
    // (1)
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    var stringTokenizer = StringTokenizer(bufferedReader.readLine(), " ")

    // (2)
    val num = stringTokenizer.nextToken().toInt()
    val quNum = stringTokenizer.nextToken().toInt()

    // (3)
    val S = LongArray(num+1)
    stringTokenizer = StringTokenizer(bufferedReader.readLine(), " ")

    // (4)
    for (i in 1 .. num) {
        S[i] = S[i-1] + stringTokenizer.nextToken().toInt()
    }

    // (5)
    for (q in 0 until  quNum) {
        stringTokenizer = StringTokenizer(bufferedReader.readLine(), " ")
        val i = stringTokenizer.nextToken().toInt()
        val j = stringTokenizer.nextToken().toInt()
        println(S[j] - S[i-1])
    }
}