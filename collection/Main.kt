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

    //Diferença do hashset para a arraylist = Ela não aceita numeros repitidos e os organiza da forma que achar melhor
    var set = hashSetOf(1,2,3,4,4,60,70)
    println(set)
    set.add(100)
    set.remove(3)
    println(set)


    println("\n")

    //Collection de chave-valor
    var map = hashMapOf("chave-1" to 1, "chave-2" to 2, "chave-3" to 3, "chave-4" to 4)

    map.put("chave-5" ,  5)
    println(map)
    map.remove("chave-2")
    for (chaves in map.keys){
        println(chaves + " = " + map.get(chaves))
    }


}