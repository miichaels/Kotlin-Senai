fun main(args: Array<String>) {

    //aula de array
    //array sem definição de tipo e imutavel no tamanho

    var array = arrayOf("SP", "MG", "PE", "BA")
    array[3] = "SC"
    println(array[2])
    println(array.contentToString())

    //array com definição de tipo
    var array2 = intArrayOf(1, 2, 3, 4, 5)
    println(array2[2])
    //usando for
    for (num in array2){
        println("numero:  $num")
    }

    //imprimindo com indice e valor
    for ((a, num) in array2.withIndex()){
        print("\nindice: $a - numero: $num")
    }

        println("\n")


    //Somando arrays do mesmo tipo
    var estados = arrayOf("TO", "DF", "AM");
    var todos = array + estados;
    for (est in todos){
        println("Estados: $est")
    }



    var palavra = "eu sou uma string"
    //println(palavra[1])
    for (pa in palavra){
        println("Letra: $pa")
    }
        println("\n")

    //array bidimensional
    var arr: Array<IntArray> = arrayOf(
        intArrayOf(1,2,3),
        intArrayOf(4,5,6,7),
        intArrayOf(8,9)
    )
    for (i in arr.indices){
        println(arr[i].contentToString())
    }
    println(arr.contentDeepToString()) //imprime em forma de matriz
    println(arr[0].contentToString()) //imprime a matriz 0
    //println(arr[1][1])
    //println(arr[0][0])


}