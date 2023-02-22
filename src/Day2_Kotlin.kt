import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.Scanner
import java.util.StringTokenizer

fun main() {
    // (1)
    val scanner = Scanner(System.`in`)
    val N = scanner.nextInt()

    // (2)
    val arr = DoubleArray(N)

    // (3)
    for (i in 0 until N) {
        arr[i] = scanner.nextDouble()
    }

    // (4)
    scanner.close()
    var sum: Double = 0.0
    var max: Double = 0.0

    // (5)
    for (i in 0 until N) {
        if (arr[i] > max) max = arr[i]
        sum += arr[i]
    }

    // (6)
    println(sum * 100 / max / N)
}

fun buffer() {
    // (1)
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val N = bufferedReader.readLine().toInt()

    // (2)
    val arr = DoubleArray(N)
    val stringTokenizer = StringTokenizer(bufferedReader.readLine(), " ")

    // (3)
    for (i in 0 until N) {
        arr[i] = stringTokenizer.nextToken().toDouble()
    }

    // (4)
    bufferedReader.close()
    var sum = 0.0
    var max = 0.0

    // (5)
    for (i in 0 until N) {
        if (arr[i] > max) max = arr[i]
        sum += arr[i]
    }

    // (6)
    println(sum * 100 / max / N)
}