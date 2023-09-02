fun main(args: Array<String>) {
  //collections list
    var items = listOf("SP","BH", "RJ") //list imutável
    var numeros = mutableListOf(1,2,43) //totalmento mutavel
    println(items)
    println(numeros)

    println("\n")

    //ArrayList
    var mix = arrayListOf("SP",1,3) //Array mutavel com funcoes
    println(mix)
    mix.add("MG")
    mix.add("AL")
    println(mix)

    println(mix.isEmpty()) //Mostra se é vazio - true or false
    println(mix.size)//mostra a quantidade de itens na lista


    var nomes = arrayListOf("Jose","Paulo","Maria", "Felipe")
    nomes.add("Roger")
    println(nomes)
}