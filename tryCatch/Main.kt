import java.lang.Exception

fun main(args: Array<String>) {

    try {
        print("Digite um numero: ")
        var num : Int = readln()!!.toInt()
        var divisao = 100/num
        println("A divisão é : $divisao")
    }catch (e: Exception){
        println("Erro é : ${e.message}")
    }finally {
        println("encerrado")
    }
}