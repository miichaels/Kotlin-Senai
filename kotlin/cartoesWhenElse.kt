class cartoesWhenElse {
    /*Switch case*/

    var opcoes = opcoesCartoes()

    fun opcoesCartoes(){
        println("Digite um numero entre as opções de cartão: ")
        var opcao: Int = readLine()!!.toInt()
        when(opcao){
            1-> println("Conta Corrente")
            2-> println("Cartão de crédito")
            3-> println("Internet Banking")
            else->{
                println("Nnhuma opção encontrada")
                println("Fale com nossos Atendentes.")
                "nada a decharar"
                var d = dirigir()
            }
        }
    }

}