fun main (args: Array<String>) {

    println("Digite o primeiro numero:")
    val X: Int = readLine()!!.toInt()

    // NullPointerException

    print("Digite o segundo numero:")
    val Y: Int = readLine()!!.toInt()

    val resultado: Int = X * Y

    println("O resultado da multiplicação é = $resultado")
}