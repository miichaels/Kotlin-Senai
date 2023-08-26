class dirigir {

    var d = dirigindo()

    fun dirigindo(){
        println("Digite sua idade: ")
        var idade = readLine()!!.toInt()
        if (idade < 18){
            println("Voce não pode dirigir.")
        }else if (idade < 21 ){
            println("Você não pode beber, mas pode dirigir!")
        }else if (idade < 25){
            println("Você pode beber e pode dirigir! mas não ao mesmo tempo.")
        }else{
            println("Liberado!!")
        }

        /*O mais proximo do operador ternario do java*/
        var final = if(idade>=18) "Maior de idade " else "Menor de idade"
        println(final)

    }



}