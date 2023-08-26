class numerosMMM {

    var m = medias();

    fun medias(){
        var valMaior = Int.MIN_VALUE
        var valMedio = Int.MIN_VALUE
        var valMenor = Int.MAX_VALUE

        for (x in 1..3) {
            println("Numeros para - Maior | Menor | Medio ")
            print("Digite o valor $x: ")
            val valor = readLine()!!.toInt()

            if (valor > valMaior) {
                valMedio = valMaior
                valMaior = valor
            } else if (valor > valMedio) {
                valMedio = valor
            }

            if (valor < valMenor) {
                valMenor = valor
            }
        }
        println("------------------------------------------------------------------")
        println("O maior valor é $valMaior")
        println("O valor do meio é $valMedio")
        println("O menor valor é $valMenor")
        println("------------------------------------------------------------------")
    }

}