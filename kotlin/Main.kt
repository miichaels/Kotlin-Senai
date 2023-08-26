fun main(args: Array<String>) {

    var p = pessoa("Michael",26,1.80F)
    p.mostrar()

    var opcoes = cartoesWhenElse()
    println()

    var d = dirigir()
    println()

    var n = numerosMMM()
    println()


    var fusca = carro();

    println("Digite o ID do Carro");
    fusca.id = readLine()!!.toInt()
    println("Digite ano do Carro");
    fusca.ano = readLine()!!.toInt()
    println("Digite a cor do Carro");
    fusca.cor = readLine()!!.toString()
    println("Digite o modelo do Carro");
    fusca.modelo = readLine()!!.toString()

    /*fusca.mostrar()
    println("A soma é: " + fusca.soma(1,2))
    */


    println("tempo utilizado foi ${fusca.usoCarro(fusca.ano)} ")

    fusca



    /*
    var varia = iniciandoVariaveis()
    var floatTest = iniciandoVariaveis()
    */



    println("------------------------------------------------------------------")
    /*Classe primeiroK*/
    var m = primeiroK()
    println()

    /*Classe soma*/
    var num = soma()
    num.sum();
    println()

}