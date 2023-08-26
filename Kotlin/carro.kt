class carro {

    var id : Int = 0
    var ano : Int = 0
    var cor : String = ""
    var modelo : String = ""
    var anoAtual = 2023

    fun mostrar(){
        println("Você criou um carro")
        println("O ID do carro é " +id)
        println("O ano do carro é $ano")
        println("A cor do carro é $cor")
        println("O modelo do carro é $modelo")
    }

    fun soma(num1: Int, num2: Int ):Int{
        var total = num1 + num2
        return total
    }

    fun usoCarro(ano:Int):Int{
        var total = this.anoAtual - ano
        return total
    }
        init {
            println("Você é um carro")
        }


}