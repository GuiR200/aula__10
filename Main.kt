fun main(args: Array<String>) {
    atividade4()
}

fun atividade1(): Unit {
    println("Digite a primeira nota:")
    val nota1 = readLine()!!.toFloat()
    println("Digite a segunda nota:")
    val nota2 = readLine()!!.toFloat()

    val media = (nota1 + nota2) / 2

    if (media >= 9)
        println("O aluno foi aprovado com mérito!!!")
    else if (media >= 6)
        println("O aluno foi aprovado!!!")
    else if (media >= 4)
        println("O aluno está de recuperação!!!")
    else
        println("O aluno foi repreovado!!!")

}

fun atividade2(): Unit {
    println("Escolha o gênero com o qual se indentifica:\nM - Masculino\nF - Feminino\nO - Outros")
    val genero = readLine()!!

    if (genero.equals("m", true))
        println("Seja bem-vindo senhor...")
    else if (genero.equals("f", true))
        println("Seja bem-vinda senhora...")
    else if (genero.equals("o", true))
        println("Seja bem-vindo...")
    else
        println("Gênero infálido!!!")


}

fun atividade3(): Unit {
    println("Digite o primeiro número")
    val num1 = readLine()!!.toFloat()
    println("Digite o segundo número")
    val num2 = readLine()!!.toFloat()

    println("Escolha uma operação:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão")

    when (readLine()!!.toInt()) {
        1 -> println("A soma é ${num1 + num2}")
        2 -> println("A subtração é ${num1 - num2}")
        3 -> println("A multiplicação é ${num1 * num2}")
        4 -> println("A divisão é ${num1 / num2}")
        else -> println("Operação inválida!!!")
    }
}

fun atividade4(): Unit{
    println("Digite o total da compra:")
    val totalDaCompra = readLine()!!.toFloat()

    println("Escola o tipo de cliente:\n1 - Funcionário\n2 - Cliente vip\n3 - Cliente comum ")

    when(readLine()!!.toInt()){
        1 -> println("O total da compra é ${totalDaCompra - totalDaCompra * 0.10}")
        2 -> println("O total da compra é ${totalDaCompra - totalDaCompra * 0.05}")
        3 -> println("O total da compra é $totalDaCompra")
        else -> println("Tipo de cliente inválido!!!")
    }
}